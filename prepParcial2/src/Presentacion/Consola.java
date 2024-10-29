package Presentacion;
import java.io.IOException;
import logica.Estudiante;
import logica.Universidad;

public class Consola {
	
	private Universidad universidad;
	
	public Consola() {
		this.universidad = new Universidad();
		this.crearObjetos();
		this.guardar();
		this.leer();
		
	}
	
	private void leer() {
		
		try {
			this.universidad.leerEstudiantes();
			for(Estudiante estudiante: this.universidad.getEstudiantes()) {
				System.out.println(estudiante.toString());
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void guardar() {
		try {
			
			universidad.guardarEstudiantes();
			universidad.guardarCursos();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void crearObjetos() {
		this.universidad.agregarEstudiante(10, "Pedro", "Picapiedra");
		this.universidad.agregarEstudiante(20, "Pablo", "Marmol");
		this.universidad.agregarCurso(1, "DPOO", 4);
		this.universidad.agregarCurso(2, "Calculo", 3);
		
	}
	
	public static void main(String[] args) {
		new Consola();
	}
	
	
	
	

}
