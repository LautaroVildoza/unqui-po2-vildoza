package ar.edu.unq.po2.tp9.ejercicio2;

public abstract class Empleado {
	
	private int porcentajeDesc = 13;
	
	public int sueldo() {
		return this.sueldoTotal() - this.cantTotalDescuentos();
	}
	
	public int cantTotalDescuentos() {
		return (this.sueldoTotal() * porcentajeDesc) / 100;
	}
	
	public abstract int sueldoTotal();
}
