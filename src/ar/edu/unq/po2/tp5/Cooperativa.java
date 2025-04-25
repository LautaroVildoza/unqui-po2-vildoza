package ar.edu.unq.po2.tp5;

public class Cooperativa extends Producto{
		
	public Cooperativa(String nombre, int cantidad, double precio) {
		super(nombre, cantidad, precio);
	}

	@Override
	public double precioFinal() {
		return this.getPrecio() - this.descuento();
	}
	
	private double descuento() {
		return (this.getPrecio() * 10) / 100;
	}
}
