package tpnote;

import java.util.ArrayList;

public class Agence extends Emprunteur{
	private ArrayList <Employe> employees;
	private String nom;
	private Entreprise entreprise;
	
	public Agence(String pNom,Entreprise pEntreprise) {
		nom=pNom;
		entreprise=pEntreprise;
		employees=new ArrayList<Employe>();
		
	}
	public ArrayList<Employe> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employe> employees) {
		this.employees = employees;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String pNom) {
		nom = pNom;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
}
