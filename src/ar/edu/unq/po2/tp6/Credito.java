package ar.edu.unq.po2.tp6;

public abstract  class Credito {
	private Cliente clienteSolicitante;
	private double montoSolicitado;
	private int plazoEnMeses;
	
	public Credito(Cliente clienteSolicitante, double montoSolicitado, int plazoEnMeses) {
		super();
		this.clienteSolicitante = clienteSolicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Cliente getClienteSolicitante() {
		return clienteSolicitante;
	}


	public void setClienteSolicitante(Cliente clienteSolicitante) {
		this.clienteSolicitante = clienteSolicitante;
	}


	public double getMontoSolicitado() {
		return montoSolicitado;
	}



	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}



	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}



	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}



	public double montoCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}
	
	public abstract boolean esAceptable();
	
}
