package fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements Filesystem {

	String nombre;
	LocalDate fechaModificacion;
	List<Filesystem> contenido = new ArrayList<Filesystem>();
	
	public Directorio(String nombre) {
		this.nombre = nombre;
	}
	
	public void add(Filesystem file) {
		contenido.add(file);
	}
	
	public void remove(Filesystem file) {
		contenido.remove(file);
	}
	
	public String name() {
		return nombre;
	}
	
	public LocalDate dateModified() {
		return fechaModificacion;
	}
	
	@Override
	public int totalSize() {
		int total = 0;
		for(Filesystem c : contenido) {
			total += c.totalSize();
		}
		return total;
	}

	@Override
	public void printStructure() {
		for(Filesystem c : contenido) {
			c.printStructure();
		}

	}

	@Override
	public Filesystem lastModified() {
		Filesystem masReciente = contenido.get(0);
		for(Filesystem c : contenido) {
			if(c.dateModified().isAfter(masReciente.dateModified())) {
				masReciente = c;
			}
		}
		return masReciente;
	}

	@Override
	public Filesystem oldestElement() {
		Filesystem masViejo = contenido.get(0);
		for(Filesystem c : contenido) {
			if(c.dateModified().isBefore(masViejo.dateModified())) {
				masViejo = c;
			}
		}
		return masViejo;
	}

}
