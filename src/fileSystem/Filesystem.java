package fileSystem;

import java.time.LocalDate;

public interface Filesystem {

	public abstract int totalSize();
	public abstract void printStructure();
	public abstract Filesystem lastModified();
	public abstract Filesystem oldestElement();
	public abstract LocalDate dateModified();
}
