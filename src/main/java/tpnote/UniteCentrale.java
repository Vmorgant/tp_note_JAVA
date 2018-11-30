package tpnote;

public class UniteCentrale extends Empruntable {
	String id;
	public UniteCentrale(String pId) {
		super();
		setLimitationPretAuxAgences(false);
		id=pId;
	}

}
