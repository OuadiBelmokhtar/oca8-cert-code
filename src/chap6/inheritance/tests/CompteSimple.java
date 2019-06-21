package chap6.inheritance.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CompteSimple extends Compte {
	private float decouvert;

	// constructeur

	public CompteSimple() {
		//
	}

	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	@Override
	public void verser(float mt) {
		// TODO Auto-generated method stub
		super.verser(mt);
	}

	// on constate que la methode static ne peut pas être redéfinit
	/*
	 * @Override public static void util() {
	 * 
	 * }
	 */
	public void retirer(float mt) {
		if (mt + decouvert > solde)
			solde -= mt;

	}

	// Redéfinition de la méthode toString
	public String toString() {
		return ("Compte Simple " + super.toString() + " Découvert=" + decouvert);
	} 

	// class CompteSimple extends Compte
	public void afficherSolde() {
		System.out.println("super.solde: " + super.solde);
		System.out.println("this.solde: " + this.solde);
		// this.solde et super.solde font reference a la meme variable d instance, car
		// il y a une seul var solde declare ds la classe Compte et c la meme herite ds
		// CompteSimple.

	}

	// class CompteSimple extends Compte
	@Override
	public void m1() {

	}
}
