package ar.edu.unju.fi.model;

public class RegistroNota {
	
	private String codigo ;
	private String alumno; 
	private String materia;
	private Float notafinal;
	
	

	

	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNota(String codigo, String alumno, String materia, Float notafinal) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notafinal = notafinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Float getNotafinal() {
		return notafinal;
	}

	public void setNotafinal(Float notafinal) {
		this.notafinal = notafinal;
	}

	@Override
	public String toString() {
		return "RegistroNota [codigo=" + codigo + ", alumno=" + alumno + ", materia=" + materia + ", notafinal="
				+ notafinal + "]";
	}
	
	
	

}