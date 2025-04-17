package ar.edu.unq.po2.tp4.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.PrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private PrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new PrimeraNecesidad("Leche", 8d, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
}
