package tpnote;

public class UC extends Empruntable {
	public UC() {
		super();
		setLimitationPretAuxAgences(false);
	}
	public UC(boolean empruntableAgence) {
		super();
		setLimitationPretAuxAgences(empruntableAgence);
	}
}
