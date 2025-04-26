package ar.edu.unq.po2.tp5.factura;

public class FacturaImpuesto extends Factura{
	private double tasaDelServicio;
	
	public double getTasaDelServicio() {
		return tasaDelServicio;
	}

	public void setTasaDelServicio(double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}

	@Override
	public double montoTotal() {
		return this.getTasaDelServicio();	
	}

	public FacturaImpuesto(double tasaDelServicio) {
		super();
		this.tasaDelServicio = tasaDelServicio;
	}
	
	

}
