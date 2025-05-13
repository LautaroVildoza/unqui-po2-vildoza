package ar.edu.unq.po2.tp7.videojuego;

public class Sinficha implements IEstadoMaquina{
	
	

	public Sinficha() {
		super();
	}
	
	@Override
	public double cantJugadoresPuedenJugar() {
		return 0;
	}

	@Override
	public void agregar(Maquina m) {
		m.setEstadoFicha(new Unaficha());
		
	}

	@Override
	public void iniciar(Maquina m) {
		m.setEstadoFicha(new Sinficha());
	}

}
