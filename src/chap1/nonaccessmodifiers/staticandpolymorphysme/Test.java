package chap1.nonaccessmodifiers.staticandpolymorphysme;

public class Test {

	public static void main(String[] args) {
		Fruit f=new Pomme();
		f.afficher(); // static members aren’t involved in runtime polymorphism

	}

}
