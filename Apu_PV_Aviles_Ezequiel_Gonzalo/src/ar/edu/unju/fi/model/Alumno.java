package ar.edu.unju.fi.model;

public class Alumno {
	
	private Integer legajo;
	private String apellido;
	private String nombre;
	
	
	
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}



	public Alumno (Integer legajo,String apellido,String nombre) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	

	public Integer getLegajo() {
		return legajo;
	}



	public String getApellido() {
		return apellido;
	}



	public String getNombre() {
		return nombre;
	}



	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + "]";
	}



	

}