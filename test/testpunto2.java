import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.punto1.Counter;

import org.junit.jupiter.api.BeforeEach;

public class testpunto2 {
private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
@BeforeEach
public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.agregarNum(2);
	counter.agregarNum(3);
	counter.agregarNum(5);
	counter.agregarNum(7);
	counter.agregarNum(9);
	counter.agregarNum(13);
	counter.agregarNum(1);
	counter.agregarNum(1);
	counter.agregarNum(12);
	counter.agregarNum(42);
}

@Test
public void testEvenNumbers() {
// Getting the even occurrences
	int amount = counter.numCanMaxDePares();
// I check the amount is the expected one
assertEquals(amount, 42, "No anda numCanMaxDePares");
	}
}