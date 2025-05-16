package ar.edu.unq.po2.tp7.poquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatus {
	
	public String valor(String c) {
		if (c.length() >= 3) {
			return c.substring(0,2);
		}
		else return c.substring(0,1);
	}
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> valores = this.valoresDeCartas(c1,c2,c3,c4,c5);
		int iteracionesC1 = Collections.frequency(valores, valor(c1));
		int iteracionesC2 = Collections.frequency(valores, valor(c2));
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}
	
	private List<String> valoresDeCartas(String c1, String c2, String c3, String c4, String c5) {
		List<String> mano = new ArrayList<String>();
		
		mano.add(valor(c1));
		mano.add(valor(c2));
		mano.add(valor(c3));
		mano.add(valor(c4));
		mano.add(valor(c5));

		return mano;
	}
	
	
}
