package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
	private Integer id_proyecto;
	private String ciudad;
	private String clasificacion;
	private Integer costoProyecto;
	public Integer getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(Integer id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public Integer getCostoProyecto() {
		return costoProyecto;
	}
	public void setCostoProyecto(Integer costoProyecto) {
		this.costoProyecto = costoProyecto;
	}
	@Override
	public String toString() {
		return "Requerimiento_3 [id_proyecto=" + id_proyecto + ", ciudad=" + ciudad + ", clasificacion=" + clasificacion
				+ ", costoProyecto=" + costoProyecto + "]";
	}
	public Requerimiento_3(Integer id_proyecto, String ciudad, String clasificacion, Integer costoProyecto) {
		super();
		this.id_proyecto = id_proyecto;
		this.ciudad = ciudad;
		this.clasificacion = clasificacion;
		this.costoProyecto = costoProyecto;
	}
	public Requerimiento_3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
