package ar.edu.unq.po2.tp8.ejercicio2;

public class Soja implements Cultivo{
	private int valor = 500;
	
	
	public Soja(int valor) {
		super();
		this.valor = valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int getValor() {
		
		return this.valor;
	}

	@Override
	public void plantar(Cultivo cultivo) {
		//??
		
	}

}
