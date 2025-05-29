package ar.edu.unq.po2.tp9.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		List<WikipediaPage> similares = new ArrayList<WikipediaPage>();
		for(WikipediaPage pageAbuscar : wikipedia) {
			if(this.esSimilar(page, pageAbuscar)) {
				similares.add(pageAbuscar);
			}
		}
		return similares;
	}
		
	public abstract boolean esSimilar(WikipediaPage page, WikipediaPage page2);
	

}
