package tpnote;

public class Claviers extends Empruntable {

	String id;
	public Claviers(String pId) {
		super();
		setLimitationPretAuxAgences(false);
		id=pId;
	}
}
