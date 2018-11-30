package tpnote;

public class VideoProjecteur extends Empruntable {

	String id;
	public VideoProjecteur(String pId) {
		super();
		setLimitationPretAuxAgences(true);
		id=pId;
	}

}
