package chap6.inheritance.tests;

public class Horse extends Animal {
	public Horse() {
		super("");
		
		Animal a = new Horse();
		
		// name is inherited from Animal class
		System.out.println(((Horse) null).name); // syntaxe OK, but NPE at RT
		
		// TODO Auto-generated constructor stub
	}
}
