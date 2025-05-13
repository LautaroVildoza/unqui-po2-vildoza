package ar.edu.unq.po2.tp7.videojuego;

public class Maquina {
	
	private IEstadoMaquina estadoFicha;

	public Maquina(IEstadoMaquina estadoFicha) {
		super();
		this.estadoFicha = estadoFicha;
	}

	public double getCantJugadoresPuedenJugar() {
		return this.getEstadoFicha().cantJugadoresPuedenJugar();
	}

	public IEstadoMaquina getEstadoFicha() {
		return estadoFicha;
	}

	public void setEstadoFicha(IEstadoMaquina estadoFicha) {
		this.estadoFicha = estadoFicha;
	}

	public void agregarFicha() {
		this.getEstadoFicha().agregar(this);
	}

	public void accionarBoton() {
		this.getEstadoFicha().iniciar(this);
		
	}
	
}
