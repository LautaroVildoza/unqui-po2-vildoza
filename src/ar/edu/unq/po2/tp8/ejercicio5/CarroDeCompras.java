package ar.edu.unq.po2.tp8.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product p){
		this.getProducts().add(p);
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public int totalRounded() {
		return (int) this.getProducts().stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
	public float total() {
		return (float) this.getProducts().stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
}
