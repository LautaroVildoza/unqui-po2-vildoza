package ar.edu.unq.po2.tp9.ejercicio3;

public class PropiedadEnComun extends Filtro{

	@Override
	public boolean esSimilar(WikipediaPage page, WikipediaPage page2) {
		return page.getInfobox().keySet().stream().anyMatch(inbox -> page2.getInfobox().containsKey(inbox));
	}

}
