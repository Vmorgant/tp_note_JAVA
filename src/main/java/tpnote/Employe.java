package tpnote;

public class Employe extends Emprunteur{
	private Agence agence;
	private Entreprise entreprise;
	public Employe(Agence pAgence, Entreprise pEntreprise) {
		agence=pAgence;
		entreprise=pEntreprise;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
}
