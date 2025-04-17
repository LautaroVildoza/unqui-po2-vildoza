package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	public String nombre;
	public String direccion;
	private List<Producto> productos = new ArrayList<Producto>();	
	
	public Double cantTotalDeProductos() {
		return (double) productos.size();
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	/**
	 * Calculo la suma de los prodcutos usando un forEach y una variable que se va acumulando el total de mis prodcutos,
	 * A cada prodcuto le calulo el precio.
	 * @return La suma total de los productos del supermercado,
	 */
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	

}
