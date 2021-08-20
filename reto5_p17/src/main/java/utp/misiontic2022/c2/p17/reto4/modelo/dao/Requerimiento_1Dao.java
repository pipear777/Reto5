package utp.misiontic2022.c2.p17.reto4.modelo.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
    	var response = new ArrayList<Requerimiento_1>();
        try (var connection = JDBCUtilities.getConnection();
                var statement = connection.prepareStatement("SELECT (Lider.Nombre || ' ' || Lider.Primer_Apellido ) as Lider, Lider.Cargo, COUNT(Proyecto.ID_Lider) as Proyectos FROM Lider Inner Join Proyecto  On Proyecto.ID_Lider = Lider.ID_Lider WHERE Proyecto.Constructora = 'Pegaso' Group by Proyecto.ID_Lider Order by Lider.Cargo, Lider");
                var rset = statement.executeQuery()) {

        	while (rset.next()) {
                var requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setLider(rset.getString("Lider"));
                requerimiento_1.setCargo(rset.getString("Cargo"));
                requerimiento_1.setProyectos(rset.getInt("Proyectos"));
                
                response.add(requerimiento_1);
            }
        }
        return response;
    }
}