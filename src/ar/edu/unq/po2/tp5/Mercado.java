package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.producto.Producto;
//dejo por las dudas

public class Mercado {
	private String nombre;
	private List<Producto> productos = new ArrayList<Producto>();
	private List<Caja> cajas = new ArrayList<Caja>();
	
	public double totalCobroCjas() {
		return cajas.stream().mapToDouble(caja -> caja.getMontoAPagar()).sum();
	}

	public Mercado(String nombre, List<Producto> productos, List<Caja> cajas) {
		super();
		this.nombre = nombre;
		this.productos = productos;
		this.cajas = cajas;
	}


}
