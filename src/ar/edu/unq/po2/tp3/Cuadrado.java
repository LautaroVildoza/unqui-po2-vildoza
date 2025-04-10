package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Point puntoOrigen, int lado) {
		super(puntoOrigen, lado, lado);
	}
	
	@Override
	public int area() {
		return this.getBase() * this.getBase();
	}
	
	@Override
	public String orientacion() {
		return "Cuadrado";
	}
	
}
