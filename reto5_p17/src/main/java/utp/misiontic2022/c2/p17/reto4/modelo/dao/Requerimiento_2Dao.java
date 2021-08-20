package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
		var response = new ArrayList<Requerimiento_2>();
        try (var connection = JDBCUtilities.getConnection();
                var statement = connection.prepareStatement("SELECT MaterialConstruccion.ID_MaterialConstruccion,\r\n"
                		+ "       MaterialConstruccion.Nombre_Material,\r\n"
                		+ "       Compra.Cantidad,\r\n"
                		+ "       MaterialConstruccion.Precio_Unidad,\r\n"
                		+ "       (Compra.Cantidad*MaterialConstruccion.Precio_Unidad) as Precio_Total \r\n"
                		+ "       FROM MaterialConstruccion Inner Join Compra On Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion \r\n"
                		+ "       Inner Join Proyecto On Compra.ID_Proyecto = Proyecto.ID_Proyecto Where Proyecto.ID_Proyecto IN (14, 20, 18, 36, 45, 48, 56) \r\n"
                		+ "       Order By Proyecto.ID_Proyecto ASC, MaterialConstruccion.Precio_Unidad DESC");
                var rset = statement.executeQuery()) {

        	while (rset.next()) {
                var requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setId_materialConstruccion(rset.getInt("ID_MaterialConstruccion"));
                requerimiento_2.setNombre_material(rset.getString("Nombre_Material"));
                requerimiento_2.setCantidad(rset.getInt("Cantidad"));
                requerimiento_2.setPrecio_unidad(rset.getInt("Precio_Unidad"));
                requerimiento_2.setPrecio_total(rset.getInt("Precio_Total"));
                response.add(requerimiento_2);
            }
        }
        return response;
		
    }
}

