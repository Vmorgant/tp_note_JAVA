package tpnote;

import java.util.ArrayList;

public abstract class Emprunteur {
	private ArrayList<Empruntable> stock;
	
	void ajouterAuStock(Empruntable emp) {
		stock.add(emp);
	}
	ArrayList<Empruntable> listeMateriel(){
		return stock;
	}
	boolean perdreMateriel(Empruntable emp) {
		return(stock.remove(emp));
	}
}
