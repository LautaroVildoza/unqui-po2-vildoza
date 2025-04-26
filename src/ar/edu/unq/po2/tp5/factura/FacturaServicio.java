package ar.edu.unq.po2.tp5.factura;

public class FacturaServicio extends Factura{
	private double costoPorUnidad;
	private double cantUnidadesConsumidas;
	
	
	/**
	 * Calcula el monto total en base a la miltiplicacion de sus variables.
	 */
	@Override
	public double montoTotal() {
		return this.getCostoPorUnidad() * this.getCantUnidadesConsumidas();
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public double getCantUnidadesConsumidas() {
		return cantUnidadesConsumidas;
	}

	public void setCantUnidadesConsumidas(int cantUnidadesConsumidas) {
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}

	public FacturaServicio(double costoPorUnidad, double cantUnidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	

}
