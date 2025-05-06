package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends Credito{
	private Propiedad garantia;

	public CreditoHipotecario(Cliente clienteSolicitante, double montoSolicitado, int plazoEnMeses,
			Propiedad garantia) {
		super(clienteSolicitante, montoSolicitado, plazoEnMeses);
		this.garantia = garantia;
	}
	
	

	public Propiedad getGarantia() {
		return garantia;
	}



	public void setGarantia(Propiedad garantia) {
		this.garantia = garantia;
	}



	@Override
	public boolean esAceptable() {
		return this.montoCuotaNoSupera50() && this.montoTotalNoEsMayorAl70DeLaPropiedad() && this.clienteNoSupera65CuandoTerminaElCredito();
	}



	private boolean clienteNoSupera65CuandoTerminaElCredito() {
		return this.getClienteSolicitante().getEdad() + this.anhosPrestamo() < 65;
	}



	private int anhosPrestamo() {
		return this.getPlazoEnMeses() / 12;
	}



	private boolean montoTotalNoEsMayorAl70DeLaPropiedad() {
		return this.getMontoSolicitado() < ((this.getGarantia().getValorFiscal() * 70) / 100);
	}



	private boolean montoCuotaNoSupera50() {
		return (this.getClienteSolicitante().getSueldoNetoMensual() * 50) / 100 > this.montoCuotaMensual();
	}
	
	
	
}
