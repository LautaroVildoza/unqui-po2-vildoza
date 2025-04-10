package ar.edu.unq.po2.tp3;

import java.time.LocalDate;


public class Persona {
	private String nombre ;
	private LocalDate fechaDeNacimiento ;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edad() {
		return this.getFechaDeNacimiento().getYear() - LocalDate.now().getDayOfYear();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
	public Persona (String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
