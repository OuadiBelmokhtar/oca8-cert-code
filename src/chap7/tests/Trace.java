package chap7.tests;

public class Trace {
	public static void main(String args[]) {
		method1(); // ligne 3
	}
	public static void method1() {
		method2(); // ligne 6
	}
	public static void method2() {
		String[] students = { "Shreya", "Joseph" };
		System.out.println(students[5]); // ligne 10
	}
}
