package ar.edu.unq.po2.tp7.song;

public interface IEstadoReprodcutor {
	public String play(Song s);
	public String pause(Song s);
	public String stop(Song s, Reproductor r);
	public void seleccionarEn(Song s, Reproductor r);
	public boolean puedeAgregar();
	
}
