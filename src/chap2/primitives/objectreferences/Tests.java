package chap2.primitives.objectreferences;

public class Tests {

	public static final void main(String[] args) {
		int v1 = 5;
		System.out.println("avant modif: " + v1);
		// val de v1 sera copiée ds param a
		// param a sera detruit a la fin de l'execution de modifyVal()
		modifyValPrimitiveParam(v1);
		System.out.println("après modif: " + v1);
		

	}

	// Person person1 = new Person("John");
//	Person person2 = new Person("Paul");
//	System.out.println(person1.getName() + ":" + person2.getName());
//	//swap(person1, person2);
//	//swapNames(person1, person2);
//	modifyName(person1);
//	System.out.println(person1.getName() + ":" + person2.getName());

	static void modifyValPrimitiveParam(int a) {
		// param a est considere comme variable locale
		a += 1;
		System.out.println("val param a: " + a);
	}

	public static void swap(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}

	public static void modifyName(Person p) {
		Person lp = p;
		lp.setName("Ouadi");
	}

	public static void swapNames(Person p1, Person p2) {
		String temp = p1.getName();
		p1.setName(p2.getName());
		p2.setName(temp);
	}
}
