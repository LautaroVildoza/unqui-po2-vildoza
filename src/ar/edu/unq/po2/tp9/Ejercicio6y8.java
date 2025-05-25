package ar.edu.unq.po2.tp9;

public class Ejercicio6y8 {
	/**
	 * 1.Adaptador por herencia (Clase Adapter) : Usa herencia para adaptar una clase,  El adaptador hereda de la clase a adaptar, Solo es posible cuando la clase adaptada no es final y no hay restricciones de herencia.
	 * 
	 * b. Adaptador por composición (Objeto Adapter): Usa composición: el adaptador contiene una instancia del objeto adaptado, Es más flexible que la herencia, Se considera la forma preferida en Java.
	 * 
	 * 
	 * 2. El adaptador por herencia tiene una flexibilidad menor y en cambio no puede heredar de clases final. En cambio el adaptador por compopsicion tien una felicibiladad mayor y no depende de una jerarquia
	 * 
	 * 3.Si se puede, isando extends.
	 * 
	 * 4.Aplicación del patrón Adapter: El método elements() devuelve un objeto que implementa Enumeration, Internamente, Vector adapta su estructura a Enumeration para exponer una forma de recorrerla.
	 *
	 *	Roles del patrón Adapter:
	 *	Target (Objetivo): Enumeration
	 *	Adaptee (Adaptado): Vector o su estructura interna
	 *	Adapter: la clase interna anónima que implementa Enumeration y traduce las llamadas a la estructura de Vector
	 *
	 * 5.Aplicación del patrón Adapter: iterator() devuelve un objeto que implementa Iterator, La colección se adapta al protocolo de Iterator para que puedas recorrerla.
     *
	 *	 Roles del patrón Adapter:
	 *	 Target (Objetivo): Iterator
	 *
	 *		Adaptee (Adaptado): la estructura interna de ArrayList
	 *
	 *		Adapter: el objeto retornado por iterator(), que conoce cómo acceder al contenido
	 * 
	 */
}
