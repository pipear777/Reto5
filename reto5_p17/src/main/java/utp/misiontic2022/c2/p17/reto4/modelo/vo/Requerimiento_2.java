package utp.misiontic2022.c2.p17.reto4.modelo.vo;


public class Requerimiento_2 {
    // Su código
	private Integer id_materialConstruccion;
	private String nombre_material;
	private Integer cantidad;
	private Integer precio_unidad;
	private Integer precio_total;
	
	public Integer getId_materialConstruccion() {
		return id_materialConstruccion;
	}
	public void setId_materialConstruccion(Integer id_materialConstruccion) {
		this.id_materialConstruccion = id_materialConstruccion;
	}
	public String getNombre_material() {
		return nombre_material;
	}
	public void setNombre_material(String nombre_material) {
		this.nombre_material = nombre_material;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getPrecio_unidad() {
		return precio_unidad;
	}
	public void setPrecio_unidad(Integer precio_unidad) {
		this.precio_unidad = precio_unidad;
	}
	public Integer getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(Integer precio_total) {
		this.precio_total = precio_total;
	}
	@Override
	public String toString() {
		return "Requerimiento_2 [id_materialConstruccion=" + id_materialConstruccion + ", nombre_material="
				+ nombre_material + ", cantidad=" + cantidad + ", precio_unidad=" + precio_unidad + ", precio_total="
				+ precio_total + "]";
	}
	public Requerimiento_2(Integer id_materialConstruccion, String nombre_material, Integer cantidad,
			Integer precio_unidad, Integer precio_total) {
		super();
		this.id_materialConstruccion = id_materialConstruccion;
		this.nombre_material = nombre_material;
		this.cantidad = cantidad;
		this.precio_unidad = precio_unidad;
		this.precio_total = precio_total;
	}
	public Requerimiento_2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
