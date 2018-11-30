package tpnote;

import java.util.ArrayList;

public class Administrateur extends Employe {

	public Administrateur(Agence pAgence, Entreprise pEntreprise) {
		super(pAgence, pEntreprise);
	}
	public boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur) {
		if(empruntable.isDefectueux()==false && !(empruntable.isLimitationPretAuxAgences() && emprunteur instanceof Employe) ) {
			emprunteur.ajouterAuStock(empruntable);
			this.stockEntreprise(this.getEntreprise()).remove(empruntable);
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
	public ArrayList<Empruntable> stockEntreprise(Entreprise ent){
		ArrayList<Empruntable> list=new ArrayList<Empruntable>();
		list.addAll(ent.listeMateriel());
		return (list);
	}
	public ArrayList<Empruntable> stockAgence(Agence age){
		ArrayList<Empruntable> list=new ArrayList<Empruntable>();
		list.addAll(age.listeMateriel());
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
	public void supprimerMaterielEntreprise(Entreprise entreprise) {
		supprimerMaterielDefectueuxDe(entreprise);
	}
	public void supprimerMaterielAgence(Agence agence) {
		supprimerMaterielDefectueuxDe(agence);
	}
	private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur) {
		ArrayList<Empruntable> list=emprunteur.listeMateriel();
		for(Empruntable empruntable : list) {
			if (empruntable.isDefectueux())
				list.remove(empruntable);
		}
	}

}
