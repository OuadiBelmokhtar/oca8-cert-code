package chap6.inheritance.tests;

public abstract class Animal {
	String name;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String s) {
		// TODO Auto-generated constructor stub

	}

	public abstract void absM1();

	public static void main(String[] args) {
		Animal animal = null;
		animal.absM1();//compiles, but throws NPE at RT
	}

}
