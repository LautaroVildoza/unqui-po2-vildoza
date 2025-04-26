package ar.edu.unq.po2.tp5.factura;

import ar.edu.unq.po2.tp5.interfaces.Cobrable;

public abstract class Factura implements Cobrable{

	/**
	 * devuelve el total a pagar.
	 */
	@Override
	public double getMontoAPagar() {
		return this.montoTotal();
	}
	
	
	@Override
	public void registrarse() {
		
	}

	@Override
	public boolean sePuedeRegistrar() {
		return true;
	}
	
	public abstract double montoTotal();
}
