package ar.edu.unq.po2.tp5;

public class ActividadLectura {
	
	
	/**
	 * 1. Las ventajas al polimorfismo brindan las Interfaces en java es que, hago un tipo general que entiendan un mismo (o varios) mensajes pero que antes eran de tipo diferentes,
	 * esto me permite que los pueda tratar como lo mismo individualemente de como este implementado ese mensaje.
	 * 
	 * 2. No siempre se puede ya que aveces es una limitacion para mi modelo, ya que no es escalable y actualizable, hay que ver los casos en los que es conveniente y en los que no.
	 * 
	 * 
	 * 3. La ventaja mas grande es que puede tener metodos abtractos que luego una clase concreta la va a definir.
	 * 
	 * 
	 * 4. No, de hecho la caracteristica que tienen las interfaces es que no se implementan los mensajes que va a entender las clases, por eso se dice que las clases "firman ese contrato".
	 * 
	 * 
	 * 5. No es recomendable pq todas las que las hereden deben tener ese mensaje definido y capaz algunas clases ya no tendria sentido que tenga ese mensaje.
	 * 
	 * 
	 * 6. No es necesario porque como no es tipado el lenguaje, no le interesa de que tipo son sus clases, solo tiene que cumplir que la clase entiende el mensaje mandado, pero en java,
	 * que si en un lenguaje tipado esto no se puede hacer, ya que debe ser del mismo tipo.
	 * 
	 */
	
	/** Interfaces, Colecciones y otras yerbas.
	 * 
	 * *Se deberia ver para que caso es Recomendable usar cada tipo en mi casa usaria estos:
	 * 
	 * XXX	= ArrayList
	 * 
	 * YYY	= List 
	 * 
	 * ZZZ	= ArrayList
	 * 
	 * WWW	= Collection
	 * 
	 * 
	 */
	
	
	/**
	 * * De Smaltalk a java.
	 * 
	 * 4. No, no fue necessario ya que como las dos clases entienden el mensaje getName() a wollok no le importa que tipo sea, ya que no es un lenguaje tipado. El mecanismo
	 * que permite esto se llama POLIMORFISMO.
	 *
	 * 
	 * 5. No, creo que mediante el polimorfismo es que entienden estos mensajes. En el caso de wollok si el metodo getName() devuelve lo mismo no pasaria nada. Deberia crearse una interfaz
	 * Imprimible o nombrable para poder anhadir el metodo ahi y que cada clase "sepa que hacer".
	 * 
	 * 
	 */
}
