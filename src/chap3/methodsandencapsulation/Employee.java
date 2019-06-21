package chap3.methodsandencapsulation;

class Employee {
	String name;
	int age=1;

	Employee() {
		// this();// Error: Recursive constructor invocation
	}

	Employee(String newName, int newAge) {
		// this(newName, newAge);
		name = newName;
		age = newAge;

	}

	void modifyVal(int a) {
		a = a + 1;
		System.out.println(a);
	}

	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e.age);
		e.modifyVal(e.age);
		System.out.println(e.age);

	}
}
