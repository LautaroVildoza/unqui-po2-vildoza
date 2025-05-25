package ar.edu.unq.po2.tp9.ejercicio2;

public class Temporario extends Empleado{
	
	private int hsTrabajadas;
	private int sueldoBasico;
	private boolean estaCasado;
	private boolean tieneHijos;

	@Override
	public int sueldoTotal() {
		return 5 * this.getHsTrabajadas() +this.getSueldoBasico() + this.extraSiTieneHijosYEstaCasado();
	}
	
	public int getHsTrabajadas() {
		return hsTrabajadas;
	}
	
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int extraSiTieneHijosYEstaCasado() {
		if(this.getEstaCasado() && this.getTieneHijos()) {
			return 100;
		} else {
			return 0;
		}
	}
	
	public boolean getEstaCasado() {
		return estaCasado;
	}
	
	public boolean getTieneHijos() {
		return tieneHijos;
	}

}
