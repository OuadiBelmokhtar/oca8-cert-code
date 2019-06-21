package exercices.seriesalgoc;

import java.util.Scanner;

public class SeptTemp {
	// exo saisi des 7 temperatures de la semaine, calculer moy, max et min
	public static void main(String[] args) {
		int[] temps = new int[5];
		int i, max, min, moy, sum = 0;
		Scanner clavier = new Scanner(System.in);

		for (i = 0; i < temps.length; i++) {
			do {
				System.out.println("Temp " + (i + 1) + ":");
				temps[i] = clavier.nextInt();
			} while (temps[i] < -50 || temps[i] > 50);

			sum += temps[i];
		}

		max = temps[0];
		for (i = 0; i < temps.length; i++) {
			if (temps[i] > max) {
				max = temps[i];
			}
		}

		min = temps[0];
		for (i = 0; i < temps.length; i++) {
			if (temps[i] < min) {
				min = temps[i];
			}
		}

		moy = sum / temps.length;
		System.out.println("Temp moy: " + moy);
		System.out.println("Temp max: " + max);
		System.out.println("Temp min: " + min);
	}
}
