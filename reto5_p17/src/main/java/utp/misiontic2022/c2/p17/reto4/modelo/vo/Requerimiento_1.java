package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_1 {
    // Su código
	 private String lider;
	 private String cargo;
	 private Integer proyectos;
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getProyectos() {
		return proyectos;
	}
	public void setProyectos(Integer proyectos) {
		this.proyectos = proyectos;
	}
	@Override
	public String toString() {
		return "Requerimiento_1 [lider=" + lider + ", cargo=" + cargo + ", proyectos=" + proyectos + "]";
	}
	public Requerimiento_1(String lider, String cargo, Integer proyectos) {
		super();
		this.lider = lider;
		this.cargo = cargo;
		this.proyectos = proyectos;
	}
	public Requerimiento_1() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	 
}
