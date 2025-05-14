package ar.edu.unq.po2.tp7.song;

public class NoSeleccionCanciones implements IEstadoReprodcutor{

	@Override
	public String play(Song s) {
		return "Error";
	}

	@Override
	public String pause(Song s) {

		return s.pause();
	}

	@Override
	public String stop(Song s, Reproductor r) {
		this.cambiarEstado(r);
		return s.stop();
		
	}

	@Override
	public void seleccionarEn(Song s, Reproductor r) {
		
	}

	@Override
	public boolean puedeAgregar() {
		return false;
	}
	
	private void  cambiarEstado(Reproductor r) {
		r.setEstadoRepro(new SeleccionCanciones());
	}

}
