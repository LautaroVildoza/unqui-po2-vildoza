package ar.edu.unq.po2.tp7.song;

import java.util.ArrayList;
import java.util.List;

public class Reproductor {
	private IEstadoReprodcutor estadoRepro;
	private Song cancionSeleccionada;
	private List<Song> canciones = new ArrayList<Song>();
	
	public Reproductor(IEstadoReprodcutor estadoRepro) {
		super();
		this.estadoRepro = estadoRepro;
	}
	
	public Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}


	public void setCancionSeleccionada(Song cancionSeleccionada) {
		this.cancionSeleccionada = cancionSeleccionada;
	}


	public IEstadoReprodcutor getEstadoRepro() {
		return estadoRepro;
	}

	public void setEstadoRepro(IEstadoReprodcutor estadoRepro) {
		this.estadoRepro = estadoRepro;
	}

	public List<Song> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Song> canciones) {
		this.canciones = canciones;
	}

	public String play() {
		return this.getEstadoRepro().play(this.getCancionSeleccionada(), this);
	}
	
	public String pause() {
		return this.getEstadoRepro().pause(this.getCancionSeleccionada(), this);
	}
	
	public String stop() {
		return this.getEstadoRepro().stop(this.getCancionSeleccionada(), this);
	}
	
	public void seleccionarCancion(Song s) {
		this.getEstadoRepro().seleccionarEn(s, this);
	}
	
	public void agregarCancion(Song s) {
		if(this.getEstadoRepro().puedeAgregar()){
			this.getCanciones().add(s);
		}
	}
	
	public double cantCanciones() {
		return this.getCanciones().size();
	}
	
	
}
