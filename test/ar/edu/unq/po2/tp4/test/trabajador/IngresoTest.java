package ar.edu.unq.po2.tp4.test.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.trabajadores.Ingreso;

class IngresoTest {
	Ingreso venta;
	Ingreso reparacion;

	@BeforeEach
	public void setUp() {
		venta = new Ingreso(4, "Venta - SAMSUNG A15", 300000.0);
		reparacion = new Ingreso(5, "Reparación pin de carga - MOTO G54", 20000.0);
	}

	@Test
	void testMesDePercepcion() {
		assertEquals(4, venta.getMes());
	}

	@Test
	void testMonto() {
		assertEquals(20000.0, reparacion.getMontoPercibido());
	}

	@Test
	void testMontoImponible() {
		assertEquals(reparacion.getMontoImponible(), reparacion.getMontoPercibido());
	}

}
