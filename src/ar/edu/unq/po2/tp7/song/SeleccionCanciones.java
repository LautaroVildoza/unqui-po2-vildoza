package ar.edu.unq.po2.tp7.song;

public class SeleccionCanciones implements IEstadoReprodcutor{

	@Override
	public String play(Song s) {
		return s.play();
	}

	@Override
	public String pause(Song s) {
		// TODO Auto-generated method stub
		return s.pause();
	}

	@Override
	public String stop(Song s, Reproductor r) {
		return s.stop();
	}

	@Override
	public void seleccionarEn(Song s, Reproductor r) {
		r.setCancionSeleccionada(s);
	}

	@Override
	public boolean puedeAgregar(){
		return true;
	}
}
