package ar.edu.unq.po2.tp3;

public class Rectangulo {
	public Point puntoOrigen = new Point();
	public int base = 0;
	public int altura = 0;
	
	public Point getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(Point puntoOrigen) {
		this.puntoOrigen = puntoOrigen;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

	public Rectangulo(Point puntoOrigen, int base, int altura) {
		super();
		this.puntoOrigen = puntoOrigen;
		this.base = base;
		this.altura = altura;
	}

	public int area() {
		return this.getBase() * this.getAltura();
	}
	
	public int perimetro() {
		return (this.getBase() * 2) + (this.getAltura() * 2);
	}
	
	public String  orientacion() {
		if (this.getBase() > this.getAltura()) {
			return "Horizontal";
		 } else  return "vertical";
	}
	
}
