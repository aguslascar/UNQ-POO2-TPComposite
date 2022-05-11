package fileSystem;

import java.time.LocalDate;


public class Archivo extends Filesystem{
	
	int size;
	LocalDate ultimaModificacion;
	
	public Archivo(String nombre, int tamanio) {
		/**
		 * Crea un archivo con el tamaño especificado con fecha de modificacion la fecha
		 * el cual fue creado.
		 */
		this.nombre = nombre;
		size = tamanio;
		ultimaModificacion = LocalDate.now();
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
