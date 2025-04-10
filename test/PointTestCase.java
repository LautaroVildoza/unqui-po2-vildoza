import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTestCase {
	Point punto;

	@BeforeEach
	public void setUp() {
		punto = new Point();
	}

	@Test
	void testArea() {
		punto.moverA(2,2);
		assertEquals(2, punto.getX(), "Fallo en el moverA");
	}

	@Test
	void testPerimetro() {
		punto.moverA(2,2);
		Point puntoN= punto.sumarseA(3, 2);
		assertEquals(5, puntoN.getX(), "Fallo en el sumarseA");
	}

}