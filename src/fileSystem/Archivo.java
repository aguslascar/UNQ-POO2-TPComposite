package fileSystem;

import java.time.LocalDate;


public class Archivo implements Filesystem{
	
	int size;
	
	String nombre;
	LocalDate fechaModificacion;
	
	public Archivo(String nombre, int tamanio) {
		/**
		 * Crea un archivo con el tamaño especificado con fecha de modificacion la fecha
		 * el cual fue creado.
		 */
		this.nombre = nombre;
		size = tamanio;
		fechaModificacion = LocalDate.now();
	}
	
	public String name() {
		return nombre;
	}
	
	public LocalDate dateModified() {
		return fechaModificacion;
	}
	
	@Override
	public int totalSize() {
		return size;
	}
	@Override
	public void printStructure() {
		System.out.println( this.name());
		
	}
	@Override
	public Filesystem lastModified() {
		return this;
	}
	@Override
	public Filesystem oldestElement() {
		return this;
	}
}
