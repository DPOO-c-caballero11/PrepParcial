package logica;
import java.io.IOException;
import java.util.ArrayList;
import Persistencia.ArchivoCSV;


public class Universidad {
	
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Curso> cursos;
	
	public ArrayList<Estudiante> getEstudiantes(){
		return estudiantes;
	}
	
	public ArrayList<Curso> getCursos(){
		return cursos;
	}
	
	public Universidad() {
		this.estudiantes = new ArrayList<Estudiante>();
		this.cursos = new ArrayList<Curso>();
	}
	
	public void agregarEstudiante(int id, String nombre, String apellido) {
		
		Estudiante nuevoEstudiante = new Estudiante(id, nombre, apellido);
		this.estudiantes.add(nuevoEstudiante);
	
	}
	
	public void agregarCurso(int id, String nombre, int creditos) {
		
		Curso nuevoCurso = new Curso(id, nombre, creditos);
		this.cursos.add(nuevoCurso);
	}
	
	public void guardarEstudiantes() throws IOException{
		ArrayList<String> textos = new ArrayList<String>();
		for(Estudiante estudiante: this.estudiantes) {
			textos.add(estudiante.toString());
		}
		ArchivoCSV.guardarTextoCSV(textos, "estudiantes.csv");
		
	}
	
	public void guardarCursos() throws IOException{
		ArrayList<String> textos = new ArrayList<String>();
		for(Curso curso: this.cursos) {
			textos.add(curso.toString());
		}
		ArchivoCSV.guardarTextoCSV(textos,"cursos.csv");
	}
	
	public void leerEstudiantes() throws IOException{
		ArrayList<String> textos = ArchivoCSV.leerArchivoCSV("estudiantes.csv");
		for (String texto: textos) {
			String []valores = texto.split(",");
			Estudiante estudianteLeido = new Estudiante(Integer.parseInt(valores[0]), valores[1], valores[2]);
			this.estudiantes.add(estudianteLeido);
		}
	}
	
	
	
}
