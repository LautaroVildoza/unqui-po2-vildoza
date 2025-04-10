import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class testmultioperador2 {
private Multioperador multioperador;

@BeforeEach
public void setUp() throws Exception {
	//Se crea el contador
	multioperador = new Multioperador();
	//Se agregan los numeros. Un solo par y nueve impares
	multioperador.agregarNum(2);
	multioperador.agregarNum(3);
	multioperador.agregarNum(5);
	multioperador.agregarNum(7);
	multioperador.agregarNum(9);
	
}

@Test
public void testSumaMulti() {
// Getting the even occurrences
	int amount = multioperador.resta();
// I check the amount is the expected one
assertEquals(amount, -26, "No anda multiplicar");
	}
}