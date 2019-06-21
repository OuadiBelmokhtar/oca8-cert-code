package chap6.inheritance.tests;

public class UseAnimal {

	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}

	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}

	public static void main(String[] args) {
		UseAnimal ua = new UseAnimal();
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah=new Horse();
		ua.doStuff(a);
		ua.doStuff(h);
		ua.doStuff(ah);
	}
}
