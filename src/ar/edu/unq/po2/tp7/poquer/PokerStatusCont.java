package ar.edu.unq.po2.tp7.poquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatusCont {
	
	
	public String valor(String c) {
		if (c.length() >= 3) {
			return c.substring(0,2);
		}
		else return c.substring(0,1);
	}
	
	
	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> mano = new ArrayList<String>();
		
		mano.add(c1);
		mano.add(c2);
		mano.add(c3);
		mano.add(c4);
		mano.add(c5);

		return this.jugada(mano);
	}
	
	public String jugada(List<String> mano) {
		if(this.esPoker(mano)) {
			return "Poquer";
		} else if (this.esTrio(mano)) {
			return "Trio";
		} else if(this.esColor(mano)) {
			return "Color";
		}
		return "Nada";
	}
	
	public boolean esPoker(List<String> mano) {
		List<String> valores = this.valoresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
		int iteracionesC2 = Collections.frequency(valores, valores.get(1));
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}
	
	private List<String> valoresDeCartas(List<String> mano) {
		List<String> valores = new ArrayList<String>();
		for (String carta : mano) {
			valores.add(this.valor(carta));
		}
		
		return valores;
	}
	
	public boolean esTrio(List<String >mano) {
		List<String> valores = this.valoresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
		int iteracionesC2 = Collections.frequency(valores, valores.get(1));
		int iteracionesC3 = Collections.frequency(valores, valores.get(2));
		return iteracionesC1 == 3 || iteracionesC2 == 3 || iteracionesC3 == 3;
	}
	
	public boolean esColor(List<String> mano) {
		List<String> colores = this.coloresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(colores, colores.get(0));
		return iteracionesC1 == 5;
	}
	
	public List<String> coloresDeCartas(List<String> mano){
		List<String> colores = new ArrayList<String>();
		for (String carta : mano) {
			colores.add(this.colorDeCarta(carta));
		}
		return colores;
	}
	
	public String colorDeCarta(String c) {
		if (c.length() >= 3) {
			return c.substring(2);
		}
		else return c.substring(1);
	}
	
}
	
	
 
	
	

