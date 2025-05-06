package ar.edu.unq.po2.tp6;

public class Propiedad {
	private String direccion;
	private String descripcion;
	private double valorFiscal;
	public Propiedad(String direccion, String descripcion, double valorFiscal) {
		super();
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
	}
	public double getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
