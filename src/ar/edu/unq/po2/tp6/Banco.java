package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private double dineroTotal;
	private List<Credito> creditosAprobados = new ArrayList<Credito>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Banco(String nombre, double dineroTotal) {
		super();
		this.nombre = nombre;
		this.dineroTotal = dineroTotal;
	}

	public List<Credito> getCreditosAprobados() {
		return creditosAprobados;
	}

	public void setCreditosAprobados(List<Credito> creditosAprobados) {
		this.creditosAprobados = creditosAprobados;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public double getDineroTotal() {
		return dineroTotal;
	}

	public void setDineroTotal(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}
	
	public void agregarCliente(Cliente c) {
		if(! this.clientePerteneceAlBanco(c)) {
		clientes.add(c);
		c.setBanco(this);
		} else {}
	}
	
	public void agregarSolicitud(Credito cr, Cliente c) {
		if (cr.esAceptable() && this.clientePerteneceAlBanco(c)) {			
			creditosAprobados.add(cr);
			cr.getClienteSolicitante().cobrar(cr.getMontoSolicitado());
		} else {}
	}
	
	
	private boolean clientePerteneceAlBanco(Cliente c) {
		return clientes.contains(c);
	}

	public double montoTotalDineroDesenbolsar() {
		return creditosAprobados.stream().mapToDouble(c -> c.getMontoSolicitado()).sum();
	}
	
	
}
