package ar.edu.unq.po2.tp9.ejercicio2;

public class Pasante extends Empleado{
	private int hsTrabajadas;	
	
	@Override
	public int sueldoTotal() {
		return 40 * this.getHsTrabajadas();
	}
	
	public int getHsTrabajadas() {
		return hsTrabajadas;
	}

}
