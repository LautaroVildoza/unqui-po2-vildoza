package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.producto.Cooperativa;
import ar.edu.unq.po2.tp5.producto.Producto;

class CajaTestCaseP1 {
	
		Producto arroz;
		Producto fideos;
		Producto carne;
		Producto burrata;
		Caja caja1;

		@BeforeEach
		public void setUp() {
			arroz = new Cooperativa("Arroz Molto", 5, 2200);
			fideos = new Cooperativa("Fideos sol pampeano", 1, 1000);
			carne = new Producto("cuadril", 2, 15000);
			burrata = new Producto("burrata", 0, 14000);
			caja1 = new Caja("Caja principal", 1);
		}

		@Test
		void testMonto() {
			assertEquals(0, caja1.getMontoAPagar());
		}

		@Test
		void testRegistraProdcutoSinStock() {
			caja1.registrarCobrable(burrata);
			assertEquals(0, caja1.getMontoAPagar());
		}

		@Test
		void testRegistraPrductoConStock() {
			caja1.registrarCobrable(burrata);
			caja1.registrarCobrable(carne);
			assertEquals(15000, caja1.getMontoAPagar());
		}

		@Test
		void testRegistraPrductoDeCooperativa() {
			caja1.registrarCobrable(fideos);
			assertEquals(900, caja1.getMontoAPagar());
		}
		
		@Test
		void testCompraTodosLosProductos() {
			caja1.registrarCobrable(fideos);
			caja1.registrarCobrable(carne);
			caja1.registrarCobrable(arroz);
			caja1.registrarCobrable(burrata);
			assertEquals(17880, caja1.getMontoAPagar());
		}
}
