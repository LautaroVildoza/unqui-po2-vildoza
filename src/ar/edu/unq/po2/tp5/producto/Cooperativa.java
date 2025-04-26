package ar.edu.unq.po2.tp5.producto;

public class Cooperativa extends Producto{
		
	public Cooperativa(String nombre, int cantidad, double precio) {
		super(nombre, cantidad, precio);
	}
	
	/**
	 * Devuelve el monto a pagar ya con el descuento aplicado.
	 */
	@Override
	public double getMontoAPagar() {
		return this.getPrecio() - this.descuento();
	}
	
	/**
	 * Calcula el costo del descuento.
	 */
	private double descuento() {
		return (this.getPrecio() * 10) / 100;
	}
}
