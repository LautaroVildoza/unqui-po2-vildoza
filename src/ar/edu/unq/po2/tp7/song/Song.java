package ar.edu.unq.po2.tp7.song;

public class Song {
	
	private IEstadoSong estadoSong;
	
	
	public Song(IEstadoSong estadoSong) {
		super();
		this.estadoSong = estadoSong;
	}
	
	
	public IEstadoSong getEstadoSong() {
		return estadoSong;
	}


	public void setEstadoSong(IEstadoSong estadoSong) {
		this.estadoSong = estadoSong;
	}


	public String pause() {
		return this.getEstadoSong().pause(this);
	}

	public String play() {
		return this.getEstadoSong().play(this);
	}

	public String stop() {
		return this.getEstadoSong().stop(this);
	}

}
