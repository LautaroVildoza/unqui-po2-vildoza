package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.interfaces.Agencia;
import ar.edu.unq.po2.tp5.interfaces.Cobrable;

public class Caja implements Agencia{
	private String nombre;
	private int numero;
	private double montoAPagar = 0;
	private List<Cobrable> registrados = new ArrayList<Cobrable>();
	


	public Caja(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	
	/**
	 * registra un tipo Cobrable(interfaz) lo suma a la lista de registrados, ademas cada cobrable se registra y se actualiza el monto a pagar.
	 */
	public void registrarCobrable(Cobrable c) {
		if (c.sePuedeRegistrar()) {
			registrados.add(c);
			c.registrarse();
			this.setMontoAPagar(this.getMontoAPagar() + c.getMontoAPagar());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}	
	
	/**
	 * Me devuelve la cantidad de Cobrables registrados en la caja.
	 * 
	 */
	public double cantRegistrados() {
		return registrados.size();
	}
}
