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

	private double getCostoPorUnidad() {
		return costoPorUnidad;
	}


	private double getCantUnidadesConsumidas() {
		return cantUnidadesConsumidas;
	}

	public FacturaServicio(double costoPorUnidad, double cantUnidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	

}
