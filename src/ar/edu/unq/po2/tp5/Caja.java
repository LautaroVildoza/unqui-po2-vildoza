package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private String nombre;
	private int numero;
	private double montoAPagar = 0;
	private List<Producto> productos = new ArrayList<Producto>();
	
	

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
	
	public void registrar(Producto p) {
		if (p.hayStock()) {
			this.setMontoAPagar( this.getMontoAPagar() + p.precioFinal());
			p.decrementarStock();
			productos.add(p);
		};
	}
	
	
}
