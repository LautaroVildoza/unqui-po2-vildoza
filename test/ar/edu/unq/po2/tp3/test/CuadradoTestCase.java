package ar.edu.unq.po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;

class CuadradoTestCase {
	Cuadrado cuadrado;
	Point punto;

	@BeforeEach
	public void setUp() {
		punto = new Point(1, 1);
		cuadrado = new Cuadrado(punto, 10);
	}

	@Test
	void testArea() {
		assertEquals(100, cuadrado.area(), "Fallo en el cálculo de area");
	}

	@Test
	void testPerimetro() {
		assertEquals(40, cuadrado.perimetro(), "Fallo en el cálculo de perímetro");
	}

	@Test
	void testOrientacion() {
		assertEquals("Cuadrado", cuadrado.orientacion(), "La orientación no es la esperada");
	}

}
