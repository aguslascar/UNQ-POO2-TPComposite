package juegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Caracter{
	List<Caracter> caracteres = new ArrayList<Caracter>();
	
	public void caminar(Posicion destino) {
		for(Caracter caracter : caracteres) {
			caracter.caminar(destino);
		}
	}
	
	public void agregar(Caracter caracter) {
		caracteres.add(caracter);
	}
	
	public void remover(Caracter caracter) {
		caracteres.remove(caracter);
	}
}
