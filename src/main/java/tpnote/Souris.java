package tpnote;

public class Souris extends Empruntable {

	String id;
	public Souris(String pId) {
		super();
		setLimitationPretAuxAgences(false);
		id=pId;
	}
}
