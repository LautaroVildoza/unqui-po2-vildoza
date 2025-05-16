package ar.edu.unq.po2.tp7.poquer;



public class PokerStatusJugadas {
	
	public Mano ganadorDe(Mano m1, Mano m2) {
		if(m1.getJugada() == m2.getJugada()) {
			return this.desempatar(m1,m2);
		} else if(m1.valorJugada() > m2.valorJugada()) {
			return m1;
		} else {
		return m2;
		}
	}
	
	public Mano desempatar(Mano m1, Mano m2) {
		if(m1.valorTotal() > m2.valorTotal()) {
			return m1;
		} else {
			return m2;
		}
	}
	
	
}
