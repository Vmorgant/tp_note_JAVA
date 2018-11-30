package tpnote;

import java.util.ArrayList;

public class Administrateur extends Employe {

	public Administrateur(Agence pAgence, Entreprise pEntreprise) {
		super(pAgence, pEntreprise);
	}
	public boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur) {
		if(empruntable.isDefectueux()==false && !(empruntable.isLimitationPretAuxAgences() && emprunteur instanceof Employe) ) {
			emprunteur.ajouterAuStock(empruntable);
			this.stockEntreprise().remove(empruntable);
			return true;
		}
		return false;
	}
	public boolean recupererMateriel(Empruntable empruntable, Emprunteur emprunteur) {
		return(emprunteur.listeMateriel().remove(empruntable));
	}
	public ArrayList<Empruntable> stockEmploye(Employe emp){
		return (emp.listeMateriel());
	}
	public ArrayList<Empruntable> stockEntreprise(){
		ArrayList<Empruntable> list=new ArrayList<Empruntable>();
		list.addAll(this.stockEntreprise());
		return (list);
	}
	public ArrayList<Empruntable> stockAgence(){
		ArrayList<Empruntable> list=new ArrayList<Empruntable>();
		list.addAll(this.stockAgence());
		return (list);
	}
	public void transfererMateriel(Emprunteur donneur, Empruntable materiel, Emprunteur recepteur) {
		if(!(materiel.isLimitationPretAuxAgences() && recepteur instanceof Employe)) {
		
			donneur.perdreMateriel(materiel);
			recepteur.ajouterAuStock(materiel);
		}
	}
	public void supprimerMateriel(Empruntable empruntable) {
		this.perdreMateriel(empruntable);
	}
	public void supprimerMaterielDefectueuxEntreprise() {
		supprimerMaterielDefectueuxDe(this.getEntreprise());
	}
	public void supprimerMaterielDefectueuxAgence() {
		supprimerMaterielDefectueuxDe(this.getAgence());
	}
	private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur) {
		ArrayList<Empruntable> list=emprunteur.listeMateriel();
		for(Empruntable empruntable : list) {
			if (empruntable.isDefectueux())
				list.remove(empruntable);
		}
	}

}
