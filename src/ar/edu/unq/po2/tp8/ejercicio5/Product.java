package ar.edu.unq.po2.tp8.ejercicio5;

public class Product {
	private float price;
	private String name;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}
