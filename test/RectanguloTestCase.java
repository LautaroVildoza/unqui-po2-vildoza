import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTestCase {
	Rectangulo rectangulo;
	Point punto;

	@BeforeEach
	public void setUp() {
		punto = new Point(1, 1);
		rectangulo = new Rectangulo(punto, 10, 4);
	}

	@Test
	void testArea() {
		assertEquals(40, rectangulo.area(), "Fallo en el cálculo de area");
	}

	@Test
	void testPerimetro() {
		assertEquals(28, rectangulo.perimetro(), "Fallo en el cálculo de perímetro");
	}

	@Test
	void testOrientacion() {
		assertEquals("Horizontal", rectangulo.orientacion(), "La orientación no es la esperada");
	}

}
