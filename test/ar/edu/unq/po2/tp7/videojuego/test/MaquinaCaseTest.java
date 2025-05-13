package ar.edu.unq.po2.tp7.videojuego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.videojuego.Dosfichas;
import ar.edu.unq.po2.tp7.videojuego.IEstadoMaquina;
import ar.edu.unq.po2.tp7.videojuego.Maquina;
import ar.edu.unq.po2.tp7.videojuego.Sinficha;
import ar.edu.unq.po2.tp7.videojuego.Unaficha;

class MaquinaCaseTest {

	Maquina fichines;
	IEstadoMaquina sinfichas;
	IEstadoMaquina dosfichas;
	IEstadoMaquina unaficha;
	
	@BeforeEach
	public void setUp() {
		sinfichas = new Sinficha();
		unaficha = new Unaficha();
		dosfichas = new Dosfichas();
		fichines = new Maquina(sinfichas);	
		
	}
	
	@Test
	void testMaquinaNoTieneFichas() {
		assertEquals(0, fichines.getCantJugadoresPuedenJugar());
	}
	
	@Test
	void testMaquinaTieneSoloUnaFicha() {
		assertEquals(0, fichines.getCantJugadoresPuedenJugar());
		fichines.agregarFicha();
		assertEquals(1, fichines.getCantJugadoresPuedenJugar());
	}
	
	@Test
	void testMaquinaTieneDosFichas() {
		fichines.agregarFicha();
		fichines.agregarFicha();
		assertEquals(2, fichines.getCantJugadoresPuedenJugar());
	}
	
	@Test
	void testMaquinaNoTieneFichaYJuegan() {
		fichines.accionarBoton();
		assertEquals(0, fichines.getCantJugadoresPuedenJugar());
	}
	
	@Test
	void testMaquinaTieneUnaFichaYJuegan() {
		fichines.agregarFicha();
		fichines.accionarBoton();
		assertEquals(0, fichines.getCantJugadoresPuedenJugar());
	}
	
	@Test
	void testMaquinaTieneDosFichasYJuegan() {
		fichines.agregarFicha();
		fichines.agregarFicha();
		fichines.accionarBoton();
		assertEquals(0, fichines.getCantJugadoresPuedenJugar());
	}
}
