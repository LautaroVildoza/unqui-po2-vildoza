package ar.edu.unq.po2.tp7.song;

public class Pausada implements IEstadoSong{

	@Override
	public String pause(Song song) {
		song.setEstadoSong(new Reproduciendo());
		return "Reproduciendo";
	}

	@Override
	public String play(Song song) {
		song.setEstadoSong(new Reproduciendo());
		return "Reproduciendo";
	}

	@Override
	public String stop(Song song) {
		song.setEstadoSong(new Detenida());
		return "Stop";
	}

}
