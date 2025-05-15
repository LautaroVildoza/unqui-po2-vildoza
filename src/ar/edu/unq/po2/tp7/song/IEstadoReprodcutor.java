package ar.edu.unq.po2.tp7.song;

public interface IEstadoReprodcutor {
	public String play(Song s, Reproductor r);
	public String pause(Song s, Reproductor r);
	public String stop(Song s, Reproductor r);
	public void seleccionarEn(Song s, Reproductor r);
	public boolean puedeAgregar();
	
}
