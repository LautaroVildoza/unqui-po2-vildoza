package ar.edu.unq.po2.tp7.song.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.song.Detenida;
import ar.edu.unq.po2.tp7.song.IEstadoReprodcutor;
import ar.edu.unq.po2.tp7.song.NoSeleccionCanciones;
import ar.edu.unq.po2.tp7.song.Pausada;
import ar.edu.unq.po2.tp7.song.Reproduciendo;
import ar.edu.unq.po2.tp7.song.Reproductor;
import ar.edu.unq.po2.tp7.song.SeleccionCanciones;
import ar.edu.unq.po2.tp7.song.Song;

class ReprductorCaseTest {

	Reproductor mp3;
	Song cancionR;
	Song cancionP;
	Song cancionS;
	Reproduciendo reproduciendo;
	Pausada paused;
	Detenida stoped;
	IEstadoReprodcutor modoseleccion;
	IEstadoReprodcutor modoNoSeleccion;
	
	@BeforeEach
	public void Setup() {
		mp3 = new Reproductor(new SeleccionCanciones());
		cancionR = new Song(new Reproduciendo());
		cancionP = new Song(new Pausada());
		cancionS = new Song(new Detenida());
		reproduciendo = new Reproduciendo();
		paused = new Pausada();
		stoped = new Detenida();
		modoseleccion = new SeleccionCanciones();
		modoNoSeleccion = new NoSeleccionCanciones();
	}
	
	@Test
	void testAgregarCancionesPqReproductorEstaEnModoSeleccion() {
		assertEquals(0, mp3.cantCanciones());
		mp3.agregarCancion(cancionR);
		assertEquals(1, mp3.cantCanciones());
	}
	
	@Test
	void testAgregarCancionesReproductorNOEstaEnModoSeleccion() {
		mp3.setEstadoRepro(modoNoSeleccion);
		mp3.agregarCancion(cancionR);
		assertEquals(0, mp3.cantCanciones());
	}
	
	@Test
	void testReproduceLacancionPqReproductorEstaEnModoSeleccion() {
		mp3.seleccionarCancion(cancionR);
		assertEquals("Reproduciendo", mp3.play());
	}
	
	@Test
	void testPausaCancionReproduciendo() {
		mp3.seleccionarCancion(cancionR);
		mp3.play();
		assertEquals("Pausada", mp3.pause());
	}
	
	@Test
	void testPausaCancionPausada() {
		mp3.agregarCancion(cancionP);
		mp3.seleccionarCancion(cancionP);
		assertEquals("Reproduciendo", mp3.pause());
	}
	
	 @Test
	 void testPausaCancionStop() {
		mp3.agregarCancion(cancionS);
		mp3.seleccionarCancion(cancionS);
		assertEquals("Error", mp3.pause());
	 }
	 
	  @Test
	  void testStopCancionStop() {
		mp3.seleccionarCancion(cancionS);
		assertEquals("Stop", mp3.stop());
	  }

	  @Test
	  void testStopCancionPlay() {
		mp3.agregarCancion(cancionP);
		mp3.seleccionarCancion(cancionP);
		assertEquals("Stop", mp3.stop());
		assertEquals(1, mp3.cantCanciones());
	  }
	  
	  @Test
	  void testStopCancionPausa() {
		mp3.agregarCancion(cancionP);
		mp3.seleccionarCancion(cancionP);
		assertEquals("Stop", mp3.stop());
		assertEquals(1, mp3.cantCanciones());
	  }
}
