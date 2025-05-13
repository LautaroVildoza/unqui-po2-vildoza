package ar.edu.unq.po2.tp7.videojuego;

public class Dosfichas implements IEstadoMaquina{
	
	@Override
	public double cantJugadoresPuedenJugar() {
		return 2;
	}
	
 @Override
	public void agregar(Maquina m) {
		
	}

	

	@Override
	public void iniciar(Maquina m) {
		m.setEstadoFicha(new Sinficha());
	}

}
