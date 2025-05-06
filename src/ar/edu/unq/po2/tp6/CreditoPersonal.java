package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(Cliente clienteSolicitante, double montoSolicitado, int plazoEnMeses) {
		super(clienteSolicitante, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		return this.ingresosMayores() && this.montoCuotaNoSupera70();
	}

	private boolean montoCuotaNoSupera70() {
		return (this.getClienteSolicitante().getSueldoNetoMensual() * 70) / 100 > this.montoCuotaMensual();
	}

	private boolean ingresosMayores() {
		return this.getClienteSolicitante().sueldoNetoAnual() > 15000;
	}

}
