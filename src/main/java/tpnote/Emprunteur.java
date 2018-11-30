package tpnote;

import java.util.ArrayList;

public class Emprunteur {
	public ArrayList<Empruntable> stock;
	
	public Emprunteur() {
		stock= new ArrayList<Empruntable>();
	}
	public Emprunteur(ArrayList<Empruntable> stock) {
		this.stock = stock;
	}

	public void ajouterAuStock(Empruntable emp) {
		stock.add(emp);
	}
	public ArrayList<Empruntable> listeMateriel(){
		return stock;
	}
	public boolean perdreMateriel(Empruntable emp) {
		return(stock.remove(emp));
	}
}
