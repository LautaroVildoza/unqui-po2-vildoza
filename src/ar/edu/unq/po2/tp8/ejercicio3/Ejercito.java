package ar.edu.unq.po2.tp8.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje{
	
	private List<Personaje>personajes = new ArrayList<Personaje>();
	
	

	public List<Personaje> getPersonajes() {
		return personajes;
	}



	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}
	
	


	public Ejercito(List<Personaje> personajes) {
		super();
		this.personajes = personajes;
	}



	@Override
	public void caminar() {
		this.getPersonajes().stream().forEach(p -> p.caminar());
	}

}
