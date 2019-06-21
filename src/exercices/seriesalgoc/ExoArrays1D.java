package exercices.seriesalgoc;

import java.util.Scanner;

public class ExoArrays1D {

	public static void main(String[] args) {
		// exo3serie9();
		// exo4serie9();
		exo5serie9();
	}

	static void exo3serie9() {
		// 1. Saisi 10 notes // 2. afficher nbrNotes>Moy // 3. Vérifier note entre 0 et
		// 20
		int[] notes = new int[5];
		int s = 0, moy = 0, nbrNotes = 0;
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < notes.length; i++) {

			do {
				System.out.println("Note " + i + "=");
				notes[i] = read.nextInt();

			} while (notes[i] < 0 || notes[i] > 20);
			s += notes[i];
		}
		moy = s / notes.length;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] > moy) {
				nbrNotes++;
			}
		}
		System.out.println("Moy=" + moy);
		System.out.println("Nbr notes > moy: " + nbrNotes);

	}

	static void exo4serie9() {
		// 1. remplir tableau// 2. lire, chercher x et afficher sa pos
		int[] t = new int[5];
		int i, x, pos = -1;
		Scanner read = new Scanner(System.in);
		for (i = 0; i < t.length; i++) {
			System.out.println("Entier " + i + "=");
			t[i] = read.nextInt();
		}

		System.out.println("X =");
		x = read.nextInt();

		for (i = 0; i < t.length; i++) {
			if (x == t[i])
				pos = i + 1;
		}

		System.out.println("Pos de " + x + " est " + pos);

	}

	static void exo5serie9_m1() {
		int[] t1 = new int[5];
		int[] t2 = new int[t1.length];
		Scanner read = new Scanner(System.in);
		int i, j;
		String s = "";
		for (i = 0; i < t1.length; i++) {
			System.out.print("elt " + (i + 1) + "=");
			t1[i] = read.nextInt();
			s += "|" + t1[i];
		}
		System.out.println("t1[]=" + s + "|");

		i = 0;
		s = "";
		for (j = t1.length - 1; j >= 0; j--, i++) {
			t2[i] = t1[j];
			s += "|" + t2[i];
		}

		System.out.println("t2[]=" + s + "|");

	}
	static void exo5serie9_m2() {
		int[] t1 = new int[5];
		
		Scanner read = new Scanner(System.in);
		int i, j;
		String s = "";
		for (i = 0; i < t1.length; i++) {
			System.out.print("elt " + (i + 1) + "=");
			t1[i] = read.nextInt();
			s += "|" + t1[i];
		}
		System.out.println("t1[]=" + s + "|");

		i = 0;
		s = "";
		// TODO completer ça
		for (j = t1.length - 1; j >= 0; j--, i++) {
			t1[i] = t1[j];
			s += "|" + t2[i];
		}

		System.out.println("t1[]=" + s + "|");

	}

}
