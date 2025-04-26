package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.factura.FacturaImpuesto;
import ar.edu.unq.po2.tp5.factura.FacturaServicio;
import ar.edu.unq.po2.tp5.producto.Cooperativa;
import ar.edu.unq.po2.tp5.producto.Producto;

class CajaTestFacturas {
	
	Producto arroz;
	Producto fideos;
	Producto carne;
	Producto burrata;
	FacturaServicio luz;
	FacturaServicio celular;
	FacturaImpuesto abl;
	FacturaImpuesto monotributo;
	Caja caja1;


	@BeforeEach
	public void setUp() {
		fideos = new Cooperativa("Fideos sol pampeano", 1, 1000);
		carne = new Producto("cuadril", 2, 15000);
		burrata = new Producto("burrata", 0, 14000);
		luz = new FacturaServicio(2000, 59);
		celular = new FacturaServicio(1500, 20);
		abl = new FacturaImpuesto(40000);
		monotributo = new FacturaImpuesto(150000);
		caja1 = new Caja("Caja principal", 1);
	}

	@Test
	void testMonto() {
		assertEquals(0, caja1.getMontoAPagar());
	}
	
	@Test
	void testAgregarProdcutoSinStock() {
		caja1.registrarCobrable(burrata);
		assertEquals(0, caja1.getMontoAPagar());
	}
	
	@Test
	void testAgregarPorductoSinStockYFactura() {
		caja1.registrarCobrable(burrata);
		caja1.registrarCobrable(abl);
		caja1.registrarCobrable(monotributo);
		assertEquals(190000, caja1.getMontoAPagar());
	}
	
	
	@Test
	void testAgregarTodo() {
		caja1.registrarCobrable(burrata);
		caja1.registrarCobrable(fideos);
		caja1.registrarCobrable(carne);
		caja1.registrarCobrable(abl);
		caja1.registrarCobrable(monotributo);
		caja1.registrarCobrable(celular);
		caja1.registrarCobrable(luz);
		assertEquals(353900, caja1.getMontoAPagar());
	}
	
	@Test
	void testRegistraTodo() {
		caja1.registrarCobrable(fideos);
		caja1.registrarCobrable(carne);
		caja1.registrarCobrable(abl);
		caja1.registrarCobrable(monotributo);
		caja1.registrarCobrable(celular);
		caja1.registrarCobrable(luz);
		assertEquals(6, caja1.cantRegistrados());
	}
	
}
