package juegoDeEstrategia;

public class Caballero implements Caracter{
	
	public void caminar(Posicion destino) {
		while(!(posicionActual.getPosX() == destino.getPosX())
				&& !(posicionActual.getPosY() == destino.getPosY())) {
			if(posicionActual.getPosX() < destino.getPosX()) {
				posicionActual.setPosX(posicionActual.getPosX() + 1);
			}
			else {
				posicionActual.setPosX(posicionActual.getPosX() - 1);
			}
			if(posicionActual.getPosY() < destino.getPosX()) {
				posicionActual.setPosY(posicionActual.getPosY() + 1);
			}
			else {
				posicionActual.setPosY(posicionActual.getPosY() - 1);
			}
		}
	}
}
