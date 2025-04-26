package ar.edu.unq.po2.tp5.producto;

import ar.edu.unq.po2.tp5.interfaces.Cobrable;

public class Producto implements Cobrable{
	private String nombre;
	private int cantidad;
	private double precio;
	
	public double getMontoAPagar() {
		return this.getPrecio();
	}
	
	/**
	 * devuelve si ese producto se puede registrar o no debido a su stock.
	 */
	public boolean sePuedeRegistrar() {
		return this.cantidad >=1;
	}
	
	/**
	 * Cuando se registra se resta uno al stock.
	 */
	public void registrarse(){
		this.setCantidad(this.getCantidad() - 1);
	}
	
	public Producto(String nombre, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
