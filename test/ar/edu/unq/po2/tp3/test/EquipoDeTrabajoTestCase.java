package ar.edu.unq.po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona11;

class EquipoDeTrabajoTestCase {
	Persona11 persona1;
	Persona11 persona2;
	Persona11 persona3;
	Persona11 persona4;
	Persona11 persona5;
	EquipoDeTrabajo equipo;
	
	@BeforeEach
	public void setUp() {
		persona1 = new Persona11("Lautaro", "Vildoza", 20);
		persona2 = new Persona11("Camila", "Vildoza", 26);
		persona3 = new Persona11("Victor", "Vildoza", 63);
		persona4 = new Persona11("Andrea", "Minnucci", 57);
		persona5 = new Persona11("Pancho", "Vildoza", 30);
		
		equipo = new EquipoDeTrabajo("EquipoVyM");
		equipo.contratar(persona1);
		equipo.contratar(persona2);
		equipo.contratar(persona3);
		equipo.contratar(persona4);
		equipo.contratar(persona5);
	}
	
	@Test
	void TestNombre() {
		assertEquals("EquipoVyM", equipo.getNombre(), "Falla el get Nombre");
	}
	
	@Test
	void cantDeContratados() {
		assertEquals(5, equipo.getIntegrantes().size(), "Falla el contratar");
	}
	
	@Test 
	void promedioDeEdad() {
		assertEquals(39,2, equipo.promedioEdadIntegrantes(), "Falla el promedio de edad");
	}
	
}
