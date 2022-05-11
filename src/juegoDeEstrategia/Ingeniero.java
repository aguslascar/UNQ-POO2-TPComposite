package juegoDeEstrategia;


public class Ingeniero implements Caracter{
	int bolsaLajas;
	
	public Ingeniero(Posicion posInicial, int cantidadLajas) {
		posicionActual.setPosX(posInicial.getPosX());
		posicionActual.setPosY(posInicial.getPosY());
		this.bolsaLajas = cantidadLajas;
	}
	
	public void caminar(Posicion destino) {
		while(!(posicionActual.getPosX() == destino.getPosX())
				&& !(posicionActual.getPosY() == destino.getPosY())) {
			if(posicionActual.getPosX() < destino.getPosX()) {
				posicionActual.setPosX(posicionActual.getPosX() + 1);
				posicionActual.ponerAlaja();
			}
			else {
				posicionActual.setPosX(posicionActual.getPosX() - 1);
				posicionActual.ponerAlaja();
			}
			if(posicionActual.getPosY() < destino.getPosX()) {
				posicionActual.setPosY(posicionActual.getPosY() + 1);
				posicionActual.ponerAlaja();
			}
			else {
				posicionActual.setPosY(posicionActual.getPosY() - 1);
				posicionActual.ponerAlaja();
			}
		}
	}
	
	public void agregarLajas(int cantidad) {
		bolsaLajas += cantidad;
	}
}
