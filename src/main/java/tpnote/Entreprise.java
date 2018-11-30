package tpnote;

import java.util.ArrayList;

public class Entreprise extends Emprunteur{
	
	private ArrayList<Agence> agences;
	private ArrayList<Employe> employes;
	private String nomEntreprise;
	public Entreprise(String nom) {
		nomEntreprise=nom;
		agences=new ArrayList<Agence>();
		employes=new ArrayList<Employe>();
	}
	public ArrayList<Agence> getAgences() {
		return agences;
	}
	public void setAgences(ArrayList<Agence> agences) {
		this.agences = agences;
	}
	public ArrayList<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(ArrayList<Employe> employes) {
		this.employes = employes;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
}
