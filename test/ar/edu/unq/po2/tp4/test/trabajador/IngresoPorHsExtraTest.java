package ar.edu.unq.po2.tp4.test.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.trabajadores.IngresoPorHsExtra;

import org.junit.jupiter.api.BeforeEach;

class IngresoPorHsExtraTest {
	IngresoPorHsExtra finDeSemana;

	@BeforeEach
	public void setUp() {
		finDeSemana = new IngresoPorHsExtra(4, "Atención en local - Viernes Semana Santa", 80000.00, 4);
	}

	@Test
	void testMonto() {
		assertEquals(80004.0, finDeSemana.getMontoPercibido());
	}

	@Test
	void testMesDePercepcion() {
		assertNotEquals(5, finDeSemana.getMes());
	}

	@Test
	void testCantidadHorasExtras() {
		assertEquals(4, finDeSemana.getCantPorHsExtra());
	}

	@Test
	void testMontoImponible() {
		assertNotEquals(finDeSemana.getMontoPercibido(), finDeSemana.getMontoImponible());
		assertEquals(0.0, finDeSemana.getMontoImponible());
	}

}