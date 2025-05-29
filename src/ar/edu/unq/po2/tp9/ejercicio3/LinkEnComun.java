package ar.edu.unq.po2.tp9.ejercicio3;

public class LinkEnComun extends Filtro{

	@Override
	public boolean esSimilar(WikipediaPage page, WikipediaPage page2) {
		return page.getLinks().stream().anyMatch(link -> page2.getLinks().contains(link));
	}

}
