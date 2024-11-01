package logica;

public class Curso {
	
	private int id;
	private String nombre;
	private int creditos;
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Curso(int id, String nombre, int creditos) {
		this.id = id;
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	public String toString() {
		return this.id + "," + this.nombre + "," + this.creditos;
	}
}
