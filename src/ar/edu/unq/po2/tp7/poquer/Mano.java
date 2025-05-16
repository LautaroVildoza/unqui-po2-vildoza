package ar.edu.unq.po2.tp7.poquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Mano {
	private List<Carta> cartas = new ArrayList<Carta>();
	
	private String jugada;
	
	public String getJugada(){
		return jugada;
	}
	
	public void setJugada(String a) {
		jugada = a;
	}
	
	public String jugada(List<Carta> mano) {
		if(this.esPoker(mano)) {
			return "Poquer";
		} else if (this.esTrio(mano)) {
			return "Trio";
		} else if(this.esColor(mano)) {
			return "Color";
		}
		return "Nada";
	}
	
	public boolean esPoker(List<Carta> mano) {
		List<Integer> valores = this.valoresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
		int iteracionesC2 = Collections.frequency(valores, valores.get(1));
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}
	
	private List<Integer> valoresDeCartas(List<Carta> mano) {
		List<Integer> valores = new ArrayList<Integer>();
		for (Carta carta : mano) {
			valores.add(carta.getValor());
		}
		
		return valores;
	}
	
	public boolean esTrio(List<Carta> mano) {
		List<Integer> valores = this.valoresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
		int iteracionesC2 = Collections.frequency(valores, valores.get(1));
		int iteracionesC3 = Collections.frequency(valores, valores.get(2));
		return iteracionesC1 == 3 || iteracionesC2 == 3 || iteracionesC3 == 3;
	}
	
	public boolean esColor(List<Carta> mano) {
		List<String> colores = this.coloresDeCartas(mano);
		int iteracionesC1 = Collections.frequency(colores, colores.get(0));
		return iteracionesC1 == 5;
	}
	
	public List<String> coloresDeCartas(List<Carta> mano){
		List<String> colores = new ArrayList<String>();
		for (Carta carta : mano) {
			colores.add(carta.getPalo());
		}
		return colores;
	}
	
	public int valorJugada() {
		if(this.getJugada() == "Poker") {
			return 4;
		} else if (this.getJugada() == "Color") {
			return 3;
		} else if (this.getJugada() == "Trio") {
			return 2;
		} else  {
			return 1;
		}
		
	}
	
	public int valorTotal() {
		int total = 0;
		for (Carta carta : cartas) {
			total += carta.getValor();
		}
		return total;
	}
	
	public void agregar(Carta a) {
		cartas.add(a);
	}
	
	
}
