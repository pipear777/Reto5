package utp.misiontic2022.c2.p17.reto4.vista;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    

    public static void requerimiento1(){
        try {
            // Su código
        	 var requerimiento_dao1 = controlador.consultarRequerimiento1();    	
             
    		 for (int i = 0; i<requerimiento_dao1.size(); i++)
    		 {		
    			 System.out.println(requerimiento_dao1.get(i).getLider() + " " + requerimiento_dao1.get(i).getCargo() + " " + requerimiento_dao1.get(i).getProyectos());
    		 }
  
    	 
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
        	var requerimiento_dao2 = controlador.consultarRequerimiento2();    	
             
			 for (int i = 0; i<requerimiento_dao2.size(); i++)
			 {
				 System.out.println(requerimiento_dao2.get(i).getId_materialConstruccion() + " " + requerimiento_dao2.get(i).getNombre_material() + " " + requerimiento_dao2.get(i).getCantidad() + " " + requerimiento_dao2.get(i).getPrecio_unidad() + " " + requerimiento_dao2.get(i).getPrecio_total());
			 }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
        	
        	var requerimiento_dao3 = controlador.consultarRequerimiento3();    	
             
    		 for (int i = 0; i<requerimiento_dao3.size(); i++)
    		 {
    			 System.out.println(requerimiento_dao3.get(i).getId_proyecto() + " " + requerimiento_dao3.get(i).getCiudad() + " " + requerimiento_dao3.get(i).getClasificacion() + " " + requerimiento_dao3.get(i).getCostoProyecto());
    		 }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
