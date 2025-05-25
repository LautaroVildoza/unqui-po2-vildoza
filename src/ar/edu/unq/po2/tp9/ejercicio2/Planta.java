package ar.edu.unq.po2.tp9.ejercicio2;

public class Planta extends Empleado{
	
	private int sueldoBasico;
	private int cantHijos;

	@Override
	public int sueldoTotal() {
		return this.getSueldoBasico() + (this.getCantHijos() * 0);
	}
	
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}
}
