package ar.edu.unq.po2.tp7.poquer;

public class Carta {
	private int valor;
	private String palo;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}
	
	public boolean mismoPalo(Carta a) {
		return this.getPalo() == a.getPalo();
	}
	
	public boolean esSuperior(Carta a) {
		return this.getValor() > a.getValor();
	}
}
