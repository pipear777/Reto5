package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
		
		var response = new ArrayList<Requerimiento_3>();
        try (var connection = JDBCUtilities.getConnection();
                var statement = connection.prepareStatement("SELECT Proyecto.ID_Proyecto,\r\n"
                		+ "    Proyecto.Ciudad,\r\n"
                		+ "    Proyecto.Clasificacion,\r\n"
                		+ "   SUM(Compra.Cantidad*MaterialConstruccion.Precio_Unidad) as Costo_Proyecto\r\n"
                		+ "   \r\n"
                		+ "  FROM Proyecto\r\n"
                		+ "  Inner Join Compra\r\n"
                		+ "  On Compra.ID_Proyecto = Proyecto.ID_Proyecto\r\n"
                		+ "  Inner Join MaterialConstruccion\r\n"
                		+ "  On Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion\r\n"
                		+ "  WHERE Proyecto.Ciudad = 'Pereira' OR Proyecto.Ciudad = 'Sta. Rosa de Cabal'\r\n"
                		+ "  \r\n"
                		+ "  Group by Proyecto.Ciudad, Proyecto.Clasificacion, Proyecto.ID_Proyecto\r\n"
                		+ "  HAVING SUM(Compra.Cantidad*MaterialConstruccion.Precio_Unidad) > 87000;");
                var rset = statement.executeQuery()) {

        	while (rset.next()) {
                var requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setId_proyecto(rset.getInt("ID_Proyecto"));
                requerimiento_3.setCiudad(rset.getString("Ciudad"));
                requerimiento_3.setClasificacion(rset.getString("Clasificacion"));
                requerimiento_3.setCostoProyecto(rset.getInt("Costo_Proyecto"));
                response.add(requerimiento_3);
            }
        }
        return response;
    }
}