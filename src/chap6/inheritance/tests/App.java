package chap6.inheritance.tests;

import java.util.List;

public class App {

	public static void main(String[] args) {
//		CompteSimple cs =  new CompteSimple();
//		cs.solde = 3000;
//		cs.afficherSolde();
//		System.out.println("cs solde: " + cs.solde);

		// works at CT but throws ClassCastException at RT

		Compte c1 = new Compte();
		CompteSimple cs1 = (CompteSimple) c1; // Because of c1 is a Compte in memory, c1 isn't an instance (subtype) of // CompteSimple.
//		  As a result an exception is thrown at RT: // ClassCastException: Compte
//		  cannot be cast to CompteSimple 
		System.out.println(cs1.solde);

		// works properly at CT and RT
		Compte c2 = new CompteSimple(); // object in memory is of type CompteSimple !
		CompteSimple cs2 = (CompteSimple) c2; // explicit cast is required because c2 reference var is of type Compte,
												// but in memory the object referenced by c2 is a CompteSimple
		System.out.println(cs2.solde);

		@SuppressWarnings("rawtypes")

		List list = (List) new Compte(); // ClassCastException: Compte cannot be cast to java.util.List

		Client cl = new Client(); // Client isn't a subtype of Compte
		// Compte c3 = (Compte) cl; // Impossible: cannot cast from Client to Compte
	}

}
