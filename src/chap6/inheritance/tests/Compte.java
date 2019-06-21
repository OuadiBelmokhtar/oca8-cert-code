package chap6.inheritance.tests;

import java.io.FileNotFoundException;

public class Compte {
	private int code;
	protected float solde;
	private static int nbComptes;

	public Compte() {
		++nbComptes;
		code = nbComptes;
		this.solde = 0;

	}

	public void verser(float mt) {
		solde += mt;
	}

	public void retirer(float mt) {
		if (mt < solde)
			solde -= mt;
	}
	
	// class Compte
	public void m1() throws FileNotFoundException{
		
	}
	
static void util() {
	
}
	public String toString() {
		return ("Code=" + code + " Solde=" + solde);
	}
}
