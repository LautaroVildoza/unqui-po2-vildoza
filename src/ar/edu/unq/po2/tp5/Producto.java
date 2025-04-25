package ar.edu.unq.po2.tp5;

public class Producto {
	private String nombre;
	private int cantidad;
	private double precio;
	
	public double precioFinal() {
		return this.getPrecio();
	}
	
	public void decrementarStock() {
		this.setCantidad(this.getCantidad() - 1);
	}
	
	public boolean hayStock() {
		return this.cantidad >=1;
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
	
	
}
