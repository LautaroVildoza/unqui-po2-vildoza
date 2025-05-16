package ar.edu.unq.po2.tp7.poquer.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer.Carta;
import ar.edu.unq.po2.tp7.poquer.PokerStatusCarta;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PoquerMockitoCaseTest {

	PokerStatusCarta ps;
	Carta sieteDeDiamantes;
	Carta sieteDeTrebol;
	Carta sieteDeCorazon;
	Carta sieteDePicas;
	Carta cincoDeDiamantes;
	Carta siesDeCorazon;
	Carta dosDeTrebol;
	Carta tresDeDiamante;
	
	@BeforeEach
	void Setup() {
		sieteDeDiamantes = mock(Carta.class);
		sieteDeTrebol	= mock(Carta.class);
		sieteDeCorazon = mock(Carta.class);
		sieteDePicas = mock(Carta.class);
		cincoDeDiamantes = mock(Carta.class);
		siesDeCorazon = mock(Carta.class);
		dosDeTrebol = mock(Carta.class);
		tresDeDiamante = mock(Carta.class);
		
		ps = new PokerStatusCarta();
	
		when(sieteDeDiamantes.getValor()).thenReturn(7);
		when(sieteDeTrebol.getValor()).thenReturn(7);
		when(sieteDeCorazon.getValor()).thenReturn(7);
		when(sieteDePicas.getValor()).thenReturn(7);
		when(cincoDeDiamantes.getValor()).thenReturn(5);
		when(siesDeCorazon.getValor()).thenReturn(6);
		when(dosDeTrebol.getValor()).thenReturn(2);
		when(tresDeDiamante.getValor()).thenReturn(3);
		
		when(sieteDeDiamantes.getPalo()).thenReturn("Diamante");
		when(sieteDeTrebol.getPalo()).thenReturn("Trebol");
		when(sieteDeCorazon.getPalo()).thenReturn("Corazon");
		when(sieteDePicas.getPalo()).thenReturn("Pica");
		when(cincoDeDiamantes.getPalo()).thenReturn("Diamante");
		when(siesDeCorazon.getPalo()).thenReturn("Corazon");
		when(dosDeTrebol.getPalo()).thenReturn("Trebol");
		when(tresDeDiamante.getPalo()).thenReturn("Diamante");
	
	}
	
	@Test
	void testPoquer() {
		String valor = ps.verificar(sieteDeDiamantes,sieteDeTrebol,sieteDeCorazon,sieteDePicas,cincoDeDiamantes);	//Exercise 
		assertEquals("Poquer", valor);							//Verify
	}
	
	@Test
	void testColor() {
		String valor = ps.verificar(cincoDeDiamantes,sieteDeDiamantes,sieteDeDiamantes,tresDeDiamante,cincoDeDiamantes);	//Exercise 
		assertEquals("Color", valor);							//Verify
	}

	@Test
	void testTrio() {
		String valor = ps.verificar(sieteDeCorazon,sieteDeDiamantes,sieteDeTrebol,dosDeTrebol,siesDeCorazon);	//Exercise 
		assertEquals("Trio", valor);								//Verify
	}
	@Test
	void testNada() {
		String valor = ps.verificar(dosDeTrebol, siesDeCorazon, siesDeCorazon,dosDeTrebol,sieteDeDiamantes);	//Exercise 
		assertEquals("Nada", valor);								//Verify
	}
	
	//Se utiliza el mensaje InOrden.
	
	//Se hacen llamadas o verificaciones sin importar el orden y sin requerir que ocurran necesariamente,
	
	//Se utiliza mocks aninadados.
	
	//Con el verify se verifica su se llamo o no al metodo del mock.
}
