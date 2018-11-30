package tpnote;

import java.util.ArrayList;

public class Agence extends Emprunteur{
	private ArrayList <Employe> employes;
	private String nom;
	
	public Agence(String pNom) {
		nom=pNom;
		employes=new ArrayList<Employe>();
		
	}
	public ArrayList<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(ArrayList<Employe> employes) {
		this.employes = employes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String pNom) {
		nom = pNom;
	}
}
