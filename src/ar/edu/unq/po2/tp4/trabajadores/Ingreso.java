package ar.edu.unq.po2.tp4.trabajadores;


public class Ingreso {
	public int mes;
	public String concepto;
	public double montoPercibido;
		
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public int getMes() {
		return mes;
	}

	public double getMontoImponible() {
		return this.getMontoPercibido();
	}

	public Ingreso(int mes, String concepto, double montoPercibido) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	
}
