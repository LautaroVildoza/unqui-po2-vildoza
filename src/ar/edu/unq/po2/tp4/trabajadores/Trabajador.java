package ar.edu.unq.po2.tp4.trabajadores;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	public double impuesto= 0.2;
	public List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
	
	public double getTotalPercibido() {
		return ingresosPercibidos.stream().mapToDouble(ingresos -> ingresos.getMontoPercibido()).sum();
	}
	
	public double getMontoImponible() {
		return ingresosPercibidos.stream().mapToDouble(ingresos -> ingresos.getMontoImponible()).sum();
	}
	
	
	public double getimpuestoAPagar() {
		return this.getMontoImponible() * this.getImpuesto();
	}
	
	public double getImpuesto() {
		return impuesto;
	}
	
	public void agregarIngreso(Ingreso i) {
		ingresosPercibidos.add(i);
	}
	
	
}
