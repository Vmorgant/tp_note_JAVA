package tpnote;

public class Imprimante extends Empruntable {

	String id;
	public Imprimante(String pId) {
		super();
		setLimitationPretAuxAgences(true);
		id=pId;
	}

}
