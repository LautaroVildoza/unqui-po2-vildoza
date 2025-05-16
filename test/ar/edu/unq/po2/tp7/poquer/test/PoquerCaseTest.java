package ar.edu.unq.po2.tp7.poquer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer.PokerStatus;

class PoquerCaseTest {
	
	PokerStatus ps;
	
	@BeforeEach
	void Setup() {
		ps = new PokerStatus(); 			 //setup
	}
	
	@Test
	void testValorCarta7() {
		String valor = ps.valor("7P"); 		//Exercise
		assertEquals("7", valor);       	//Verify
	}
	
	@Test
	void testValorCarta10() {
		String valor = ps.valor("10D");		//Exercise
		assertEquals("10", valor);			//Verify
	}
	
	@Test 
	void testValorCartaQ() {
		String valor = ps.valor("QP");		//Exercise
		assertEquals("Q", valor);			//Verify
		
	}
	
	@Test
	void verificarQueEsPoker() {
		boolean poker = ps.verificar("7P","QD","7T","7C","7D");	//Exercise
		assertEquals(true, poker);								//Verify
	}
	
	@Test
	void verificarQueNoEsPoker() {
		boolean NOpoker = ps.verificar("7P","7T","QD","2Q","7D");	//Exercise
		assertEquals(false, NOpoker);								//Verify
	}

}
