package ar.edu.unq.po2.tp4;

public class PrimeraNecesidad extends Producto{
	
	public double descuento = 0.9;

	public PrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		this.descuento=descuento;
		// TODO Auto-generated constructor stub
	}

	public PrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		// TODO Auto-generated constructor stub
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	
	public double getPrecio() {
		return precio * descuento;
	}

}
