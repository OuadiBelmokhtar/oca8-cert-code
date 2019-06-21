package chap5.tests;

import java.util.Iterator;

public class ForLoop {
	public static void main(String[] args) throws InterruptedException {
//		// Define an infinite for loop
//		// condition d'arret tjr vraie
//				for (; true;) {
//					System.out.println("Ok");
//				}
//
//				// absence de l'incrementation
//				for (int i = 0; i < 5;) {
//					System.out.println("Ok");
//				}
//
//				// absence de condition d'arret
//				for (;;) {
//					System.out.println("Ok");
//
//				}

		// Condition composee
		for (int i = 0, j=1; i < 5 && j<10 ;i++, j++) {
			System.out.println("Ok");
		}
		// Making a clock
		int cptH, cptM = 0;
		for (cptH = 0; cptH < 24 ; cptH++) {
			for (cptM = 1; cptM <= 60; cptM++) {
				System.out.print(cptH + " Hour " + cptM + " Minute");
				Thread.sleep(1);
			}

			if (cptH + 1 == 24)
				System.out.println("1 Day");
			else
				System.out.println((cptH + 1) + " Hour");

		}

		// Using enhanced for to iterate an array
//		int total = 0;
//		int primeNums[] = { 2, 3, 7, 11 };
//		for (int num : primeNums) {
//			if (num == 3) {
//				num = 5;
//			}
//			total += num;
//
//		}
//		for (int i : primeNums) {
//			System.out.println(i);
//		}
//		System.out.println(total);

	}
}
