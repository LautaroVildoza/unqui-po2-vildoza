package ar.edu.unq.po2.tp8.ejercicio2;

public class Trigo implements Cultivo{
	private int valor = 300;
	
	
	
	public Trigo(int valor) {
		super();
		this.valor = valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	@Override
	public int getValor() {
		return valor;
	}

	@Override
	public void plantar(Cultivo cultivo) {
		// ??
		
	}

}
