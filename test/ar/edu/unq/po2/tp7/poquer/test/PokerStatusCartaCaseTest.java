package ar.edu.unq.po2.tp7.poquer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer.Carta;
import ar.edu.unq.po2.tp7.poquer.PokerStatusCarta;

class PokerStatusCartaCaseTest {


	PokerStatusCarta ps;
	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	Carta c5;
	Carta c6;
	Carta c7;
	Carta c8;
	Carta c9;
	Carta c10;
	Carta c11;
	Carta c12;
	Carta c13;
	
	
	@BeforeEach
	void Setup() {
		ps = new PokerStatusCarta();  //Setup
		c1 = new Carta(7,"Diamante");
		c2 = new Carta(7, "Corazon");
		c3 = new Carta(7, "Trebol");
		c4 = new Carta(7, "Picas");
		c5 = new Carta(5, "Diamante");
		c6 = new Carta(4, "Diamante");
		c7 = new Carta(10, "Diamante");
		c8 = new Carta(3, "Diamante");
		c9 = new Carta(10, "Corazon");
		c10 = new Carta(8, "Diamante");
		c11 = new Carta(3, "Trebol");
		c12 = new Carta(3, "Corazon");
		c13 = new Carta(2, "Trebol");
	}
	
	@Test
	void testPoquer() {
		String valor = ps.verificar(c1,c2,c3,c4,c5);	//Exercise 
		assertEquals("Poquer", valor);							//Verify
	}
	
	@Test
	void testColor() {
		String valor = ps.verificar(c6,c5,c1,c7,c8);	//Exercise 
		assertEquals("Color", valor);							//Verify
	}

	@Test
	void testTrio() {
		String valor = ps.verificar(c4,c2,c3,c9,c7);	//Exercise 
		assertEquals("Trio", valor);								//Verify
	}
	@Test
	void testNada() {
		String valor = ps.verificar(c10, c11, c12,c13,c7);	//Exercise 
		assertEquals("Nada", valor);								//Verify
	}

}
