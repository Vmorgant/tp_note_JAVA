package tpnote;

public abstract class Empruntable {
	private boolean limitationPretAuxAgences;
	private boolean defectueux;
	
	public Empruntable() {
		this.defectueux = false;
	}

	void declarerDefectueux() {
		defectueux=true;
	}
	
	boolean isDefectueux(){
		return defectueux;
	}
	
	boolean isLimitationPretAuxAgences() {
		return limitationPretAuxAgences;
	}
	void setLimitationPretAuxAgences(boolean pretableAgence) {
		limitationPretAuxAgences=pretableAgence;
	}
}
