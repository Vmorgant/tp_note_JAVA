package tpnote;

public class Routeur extends Empruntable {

	String id;
	public Routeur(String pId) {
		super();
		setLimitationPretAuxAgences(true);
		id=pId;
	}

}
