package chap1.nonaccessmodifiers.staticmembers;

public class MyClass {

	static int sVar; // can be used without creating an instance
	int nsVar; // to use it we must create an object

	int nsCount() {
		sVar = 5;
		return 10;
	} // to use it we must create an object

	static int sCount() {

		/*
		 * Une methode static n'a pas le droit de manipuler les variables d'instance.
		 * Toutefois, supposant que cela est possible, quand je fais MyClass.sCount(),
		 * ds ce cas la variable d instance nsVar qui sera manipulee a l interieure de
		 * la methode static serait a la propriete de quel objet ?
		 * 
		 * 
		 * En effet, les variables d'instance appartiennent aux instances de la classe,
		 * tandis que la methode static appartient a la classe elle meme. Ainsi, nsVar
		 * est l equivalent de this.nsVar, en plus, on peut utiliser une methode static
		 * sans instancier la classe.
		 */

		nsVar = 5; // to use it we must instanciate the class, because a static method could be
					// used without creating a class instance.
		return 10;
	} // // can be used without creating an instance

	static void incrementSVar() {
		 sVar++;
	}
	static void staticMethod() {
		
	}

	// a non-static method can call a static method
	void nonStaticMethod() {
		staticMethod();
	}
	

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.nsCount());
	}
}

interface I1 {
	void m1();
}

interface I3 {
	void m2();
}

interface I2 extends I1, I3 {

}