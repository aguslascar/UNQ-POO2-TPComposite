package fileSystem;

import java.time.LocalDate;

public abstract class Filesystem {
	
	protected String nombre;
	protected LocalDate fechaModificacion;
	
	public String name() {
		return nombre;
	}
	
	public LocalDate dateModified() {
		return fechaModificacion;
	}

	public abstract int totalSize();
	public abstract void printStructure();
	public abstract Filesystem lastModified();
	public abstract Filesystem oldestElement();
}
