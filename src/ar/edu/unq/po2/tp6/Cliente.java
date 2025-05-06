package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double dineroEfectivo;
	private double sueldoNetoMensual;
	private double dineroMensualCreditos;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double dineroEfectivo,
			double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.dineroEfectivo = dineroEfectivo;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDineroEfectivo() {
		return dineroEfectivo;
	}

	public void setDineroEfectivo(double dineroEfectivo) {
		this.dineroEfectivo = dineroEfectivo;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual - dineroMensualCreditos;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getDineroMensualCreditos() {
		return dineroMensualCreditos;
	}

	public void setDineroMensualCreditos(double dineroMensualCreditos) {
		this.dineroMensualCreditos = dineroMensualCreditos;
	}
	
	public double sueldoNetoAnual() {
		return 12 * this.getSueldoNetoMensual();
	}
	
	public void cobrar(double monto) {
		this.setDineroEfectivo(this.getDineroEfectivo() + monto);
		this.setDineroMensualCreditos(this.getDineroMensualCreditos() + monto);
	}
}
