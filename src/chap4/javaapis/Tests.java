package chap4.javaapis;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Tests {

	public static void main(String[] args) {

		String morning1 = "Morning";
		// création via double quote, Java cherche ds le pool
		System.out.println("Morning" == morning1); // affiche true

		// instanciation via new ne crée pas ds le pool
//		String morning2 = new String("Morning"); 
//		System.out.println("Morning" == morning2); //affiche false
//		
		// System.out.println("Morning");

		// Pr tester si le constructeur cherche ds le pool ou nn
//		String morning3 = "Morning"; // ajoute ds le pool
		// la creation via constructeur ne cherche pas ds le pool
//		String morning4 = new String("Morning"); // ne cherche pas ds le pool
//		System.out.println(morning3 == morning4); // affiche false

//		String varWithSpaces = " AB   CB    ";
//		System.out.print(":");
//		System.out.print(varWithSpaces.trim());
//		System.out.print(":");
//		
//		String letters = "ABCAB";
//		System.out.println(letters.replace("B", "b"));

//		StringBuilder sb = new StringBuilder("Bjr");
//		sb.append(" 2AP").append(" 1");
//		System.out.println(sb);
		// StringBuilder sb1="ok"; affectation impossible

		int[] t = { 1, 2, 3 };
		System.out.println(t[0]);
		String str = "abc";
		System.out.println(str.trim());
		

		// StringBuilder sb = "abc"; // cannot convert from String to StringBuilder

		String s1 = "Java";
		String s2 = "Java";
		s2.substring(2);
		 

		String s3 = s1.concat(" EE"); // s1 value remains unchanged
		System.out.println(s1 == s3);// false
		
		// The local variable sb1 may not have been initialized
//		StringBuilder sb1 = new StringBuilder("Abe").insert(sb1.length(),"robots");
//		
//		StringBuilder sb2 = sb1.insert(2, "cd");
//		
//		System.out.println(sb1 == sb2);// true

		List<String> list = new ArrayList(1);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);// [a, b, c, d]

		List<Character> list1 = new ArrayList<Character>(1);
		list1.add('k');
		
//		LocalTime lt=LocalTime.of(0, 0);
//		LocalDate ld=LocalDate.of(0, 0, 0);
		
		
		
	}

}
