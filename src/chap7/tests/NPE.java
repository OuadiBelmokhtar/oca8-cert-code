package chap7.tests;

public class NPE {
	static String s; // <=> s=null
	public static void main(String[] args) {
		System.out.println(s); // prints null
		System.out.println(s.toString()); // throws NPE
		System.out.println(s.length()); // throws NPE
	}
}
  