package ar.edu.unq.po2.tp7.poquer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer.PokerStatusCont;

class PoquerContinuacionCaseTest {
	
	PokerStatusCont ps;
	
	@BeforeEach
	void Setup() {
		ps = new PokerStatusCont(); 							//Setup
	}
	
	@Test
	void testPoquer() {
		String valor = ps.verificar("7D","7C","7T","7P","5D");	//Exercise 
		assertEquals("Poquer", valor);							//Verify
	}
	
	@Test
	void testColor() {
		String valor = ps.verificar("4D","5D","7D","10D","3D");	//Exercise 
		assertEquals("Color", valor);							//Verify
	}

	@Test
	void testTrio() {
		String valor = ps.verificar("7P","7C","7T","10C","10D");	//Exercise 
		assertEquals("Trio", valor);								//Verify
	}
	@Test
	void testNada() {
		String valor = ps.verificar("8D", "3T", "3C", "2T", "10D");	//Exercise 
		assertEquals("Nada", valor);								//Verify
	}

}
