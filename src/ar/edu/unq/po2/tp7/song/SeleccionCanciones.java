package ar.edu.unq.po2.tp7.song;

public class SeleccionCanciones implements IEstadoReprodcutor{

	@Override
	public String play(Song s, Reproductor r) {
		return s.play();
	}

	@Override
	public String pause(Song s, Reproductor r) {
		
		return s.pause();
	}

	@Override
	public String stop(Song s, Reproductor r) {
		this.cambiarEstado(r);
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
	
	private void  cambiarEstado(Reproductor r) {
		r.setEstadoRepro(new NoSeleccionCanciones());
	}
}
