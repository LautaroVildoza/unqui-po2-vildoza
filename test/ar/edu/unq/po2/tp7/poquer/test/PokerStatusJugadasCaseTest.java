package ar.edu.unq.po2.tp7.poquer.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer.Carta;
import ar.edu.unq.po2.tp7.poquer.Mano;
import ar.edu.unq.po2.tp7.poquer.PokerStatusJugadas;

class PokerStatusJugadasCaseTest {

	private PokerStatusJugadas ps;
	private Carta reyDeCorazones  ;
	private Carta reyDePicas      ;
	private Carta reyDeTrebol     ;
	private Carta reyDeDiamantes  ;
	private Carta diezDeCorazones ;
	private Carta cincoDeCorazones;
	private Carta tresDeCorazones ;
	private Carta asDePicas       ;
	private Carta asDeCorazones   ;
	private Carta asDeTrebol      ;
	private Carta asDeDiamantes   ;
	private Carta cincoDeDiamantes;
	
	// Con la nueva implemetación voy a tener q crear un mock por cada Mano (ni ganas ya estoy muy estresado).
	 
	@BeforeEach
	void setUp() throws Exception {
		reyDeCorazones   = mock(Carta.class);
		reyDePicas       = mock(Carta.class);
		reyDeTrebol      = mock(Carta.class);
		reyDeDiamantes   = mock(Carta.class);
		asDePicas        = mock(Carta.class);
		asDeCorazones    = mock(Carta.class);
		asDeDiamantes    = mock(Carta.class);
		asDeTrebol       = mock(Carta.class);
		tresDeCorazones  = mock(Carta.class);
		cincoDeDiamantes = mock(Carta.class);
		cincoDeCorazones =mock(Carta.class);
		diezDeCorazones = mock(Carta.class);
		
		ps = new PokerStatusJugadas();
	
        when(reyDeCorazones.getValor()).thenReturn(13);
        when(reyDePicas.getValor()).thenReturn(13);
        when(reyDeTrebol.getValor()).thenReturn(13);
        when(reyDeDiamantes.getValor()).thenReturn(13);
        when(cincoDeCorazones.getValor()).thenReturn(5);
        when(diezDeCorazones.getValor()).thenReturn(10);
        when(asDePicas.getValor()).thenReturn(14);
        when(asDeCorazones.getValor()).thenReturn(14);
        when(asDeDiamantes.getValor()).thenReturn(14);
        when(asDeTrebol.getValor()).thenReturn(14);
        when(tresDeCorazones.getValor()).thenReturn(3);
        when(cincoDeDiamantes.getValor()).thenReturn(5);
        
        when(reyDeCorazones.getPalo()).thenReturn("corazon");
        when(reyDePicas.getPalo()).thenReturn("pica");
        when(reyDeTrebol.getPalo()).thenReturn("trebol");
        when(reyDeDiamantes.getPalo()).thenReturn("diamante");
        when(cincoDeCorazones.getPalo()).thenReturn("corazon");
        when(diezDeCorazones.getPalo()).thenReturn("corazon");
        when(asDePicas.getPalo()).thenReturn("pica");
        when(asDeCorazones.getPalo()).thenReturn("corazon");
        when(asDeDiamantes.getPalo()).thenReturn("diamante");
        when(asDeTrebol.getPalo()).thenReturn("trebol");
        when(tresDeCorazones.getPalo()).thenReturn("corazon");
        when(cincoDeDiamantes.getPalo()).thenReturn("diamante");
        
	
	}

	@Test
	void seJuegaPoquerDeReyesVsPoquerDeReyesYGanaElDeReyes(){
        Mano mano1 = new Mano(); 
        Mano mano2 = new Mano(); 
        
        mano1.agregar(asDePicas); mano1.agregar(reyDeCorazones); mano1.agregar(reyDePicas); mano1.agregar(reyDeTrebol); mano1.agregar(reyDeDiamantes); 
		mano2.agregar(asDePicas); mano2.agregar(asDeCorazones); mano2.agregar(asDeDiamantes); mano2.agregar(asDeTrebol); mano2.agregar(cincoDeDiamantes);
        
		Mano ganador = ps.ganadorDe(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaPoquerDeAsesVsColorDeDiamentesYGanaPoquer() {
		Mano mano1 = new Mano(); 
        Mano mano2 = new Mano(); 
        
        mano1.agregar(asDePicas); mano1.agregar(reyDeCorazones); mano1.agregar(reyDePicas); mano1.agregar(reyDeTrebol); mano1.agregar(reyDeDiamantes); 
		mano2.agregar(cincoDeDiamantes); mano2.agregar(cincoDeDiamantes); mano2.agregar(cincoDeDiamantes); mano2.agregar(cincoDeDiamantes); mano2.agregar(cincoDeDiamantes);
        
		Mano ganador = ps.ganadorDe(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaPoquerDeAsesVsTrioDeReyesYGanaPoquer() {
		Mano mano1 = new Mano(); 
        Mano mano2 = new Mano(); 
        
		mano1.agregar(asDePicas); mano2.agregar(asDeCorazones); mano2.agregar(asDeDiamantes); mano2.agregar(asDeTrebol); mano2.agregar(cincoDeDiamantes);
        mano2.agregar(asDePicas); mano1.agregar(reyDeCorazones); mano1.agregar(reyDePicas); mano1.agregar(asDeTrebol); mano1.agregar(reyDeDiamantes); 
        
        Mano ganador = ps.ganadorDe(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaColorDeDiamantesVsColorDeCorazonesYGanaDeDiamantesPorTenerValoresMasGrandes() {
		Mano mano1 = new Mano(); 
        Mano mano2 = new Mano(); 
        
        mano1.agregar(cincoDeDiamantes); mano1.agregar(cincoDeDiamantes); mano1.agregar(cincoDeDiamantes); mano1.agregar(cincoDeDiamantes); mano1.agregar(cincoDeDiamantes); 
		mano2.agregar(tresDeCorazones); mano2.agregar(tresDeCorazones); mano2.agregar(tresDeCorazones); mano2.agregar(tresDeCorazones); mano2.agregar(tresDeCorazones);
        
		Mano ganador = ps.ganadorDe(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaTrioDeAsesYTrioDeReyesYGanaElDeAses() {
		Mano mano1 = new Mano(); 
        Mano mano2 = new Mano(); 
        
        mano1.agregar(asDePicas); mano1.agregar(asDeDiamantes); mano1.agregar(asDeTrebol); mano1.agregar(cincoDeDiamantes); mano1.agregar(cincoDeDiamantes); 
		mano2.agregar(reyDeCorazones); mano2.agregar(reyDeTrebol); mano2.agregar(reyDePicas); mano2.agregar(tresDeCorazones); mano2.agregar(tresDeCorazones);
        
		Mano ganador = ps.ganadorDe(mano1, mano2);		
        assertEquals(mano1, ganador);
	}

}
