package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona11> integrantes = new ArrayList<Persona11>();
	
	public String getNombre() {
		return nombre;
	}
	
	public void contratar(Persona11 p) {
		integrantes.add(p);
	}
	
	public int promedioEdadIntegrantes() {
		int edadTotal = 0;
		int totalIntegrantes = integrantes.size();
		for (Persona11 p : integrantes) {
			edadTotal = edadTotal + p.getEdad();
		}
		return edadTotal / totalIntegrantes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public List<Persona11> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Persona11> integrantes) {
		this.integrantes = integrantes;
	}

	
	
	
	
}
