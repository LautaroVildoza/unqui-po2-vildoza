package ar.edu.unq.po2.tp7.videojuego;

public class Unaficha implements IEstadoMaquina{
	
	@Override
	public double cantJugadoresPuedenJugar() {
		return 1;
	}

	@Override
	public void agregar(Maquina m) {
		m.setEstadoFicha(new Dosfichas());	
	}

	@Override
	public void iniciar(Maquina m) {
		m.setEstadoFicha(new Sinficha());
	}

}
