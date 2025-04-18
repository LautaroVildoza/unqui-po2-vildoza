package ar.edu.unq.po2.tp4.trabajadores;


public class IngresoPorHsExtra extends Ingreso{
	public double cantPorHsExtra;

	public IngresoPorHsExtra(int mes, String concepto, double montoPercibido, double cantPorHsExtra) {
		super(mes, concepto, montoPercibido);
		this.cantPorHsExtra = cantPorHsExtra;
	}
	
	public double getCantPorHsExtra() {
		return cantPorHsExtra;
	}
	
	@Override
	public double getMontoPercibido() {
		return this.montoPercibido + this.getCantPorHsExtra();
		}
	
	public double getMontoImponible() {
		return 0;
	} 
	
	
}
