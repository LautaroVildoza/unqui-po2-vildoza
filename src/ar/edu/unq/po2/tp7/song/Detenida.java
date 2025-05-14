package ar.edu.unq.po2.tp7.song;

public class Detenida implements IEstadoSong{

	@Override
	public String pause(Song song) {
		song.setEstadoSong(new Pausada());
		return "Error";
	}

	@Override
	public String play(Song song) {
		song.setEstadoSong(new Reproduciendo());
		return "Reproduciendo";
	}

	@Override
	public String stop(Song song) {
		return "Stop";
	}

}
