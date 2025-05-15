package ar.edu.unq.po2.tp8;

public class Ejercicio1 {
	/**
	 * 
	 * 1. ¿Cómo se logra que el cliente trate de manera uniforme tanto a objetos individuales como compuestos?
	 * 
	 * Respuesta: El patrón Composite permite a los clientes tratar objetos individuales (hojas) y composiciones de objetos (compuestos) de manera uniforme mediante el uso de una interfaz común o clase abstracta.
	 * Se define una interfaz o clase abstracta llamada, por ejemplo, Component, que declara operaciones comunes.
	 * Tanto las hojas (Leaf) como los compuestos (Composite) implementan o heredan de esta interfaz.
	 * Los compuestos almacenan otros Component (ya sean Leaf u otros Composite) y también implementan la operación común, delegando o coordinando las llamadas en sus componentes hijos.
	 * 
	 * 
	 * 2. ¿En qué casos aplicaría este patrón?
	 * 
	 * Respuesta: El patrón Composite es útil cuando:

					Se necesita representar jerarquías de objetos tipo árbol.

					Se desea que clientes manipulen objetos individuales y composiciones de objetos de forma uniforme.

					Se manejan estructuras en donde objetos contenedores pueden incluir otros objetos, y se espera realizar operaciones recursivas sobre toda la estructura.
	 * 
	 * 
	 * 3. ¿Qué elementos de la programación orientada a objetos hacen posible esto?
	 * 
	 * Respuesta: Hay tres principios fundamentales de la programación orientada a objetos que permiten implementar el patrón Composite:

				A) Herencia / Abstracción: Permite definir una interfaz común (Component) que puede ser implementada o extendida tanto por hojas como por compuestos.

				B) Polimorfismo: Permite que el cliente llame a métodos sobre un objeto de tipo Component sin saber su implementación concreta (Leaf o Composite). Así, la decisión de cómo actuar se delega al objeto real.

				C) Encapsulamiento: Oculta la complejidad de la estructura interna de los compuestos, permitiendo que los clientes no necesiten saber si están trabajando con un único objeto o una colección de ellos.
	 * 
	 * 
	 * 
	 */
}
