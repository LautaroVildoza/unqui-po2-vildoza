package ar.edu.unq.po2.tp7.videojuego;

public interface IEstadoMaquina {
	public double cantJugadoresPuedenJugar();

	public void agregar(Maquina m);

	public void iniciar(Maquina m);
}
