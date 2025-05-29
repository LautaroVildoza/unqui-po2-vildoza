package ar.edu.unq.po2.tp9.ejercicio3;

public class MismaLetraInicial extends Filtro{

	@Override
	public boolean esSimilar(WikipediaPage page, WikipediaPage page2) {
		return page.getTitle().charAt(0) == page2.getTitle().charAt(0);	
		}

}
