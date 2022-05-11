package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Filesystem {

	List<Filesystem> contenido = new ArrayList<Filesystem>();
	
	public void add(Filesystem file) {
		contenido.add(file);
	}
	
	public void remove(Filesystem file) {
		contenido.remove(file);
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
