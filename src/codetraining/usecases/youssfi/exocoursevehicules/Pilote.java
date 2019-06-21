package codetraining.usecases.youssfi.exocoursevehicules;

public class Pilote {

	private Integer code;
	private String nom;
	private static int nbrPilotes;

	public Pilote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pilote(String nom) {
		super();
		code = ++nbrPilotes;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Pilote [code=" + code + ", nom=" + nom + "]";
	}

	public Integer getCode() {
		return code;
	}

	public int getNbrPilotes() {
		return nbrPilotes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
