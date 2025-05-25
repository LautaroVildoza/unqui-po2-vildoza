package ar.edu.unq.po2.tp8.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Parcela implements Cultivo {
	private List<Cultivo> cultivos = new ArrayList<Cultivo>();
	
	
	
	public List<Cultivo> getCultivos() {
		return cultivos;
	}

	public void setCultivos(List<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}
	
	
	public Parcela(List<Cultivo> cultivos) {
		super();
		this.cultivos = cultivos;
	}

	@Override
	public int getValor() {
		return this.getCultivos().stream().mapToInt(c -> c.getValor()).sum();
	}

	@Override
	public void plantar(Cultivo cultivo) {
		if(this.validarSiPuede()) {
			cultivos.add(cultivo);
		}
	}
	
	public boolean validarSiPuede() {
		return cultivos.size() >= 4;
	}
	
}
