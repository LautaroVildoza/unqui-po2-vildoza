package ar.edu.unq.po2.tp7.song;

public class Reproduciendo implements IEstadoSong{

	@Override
	public String pause(Song song) {
		song.setEstadoSong(new Pausada());
		return "Pausada";
	}

	@Override
	public String play(Song song) {
		return "Reproduciendo";
	}

	@Override
	public String stop(Song song) {
		song.setEstadoSong(new Detenida());
		return "Stop";
	}

}
