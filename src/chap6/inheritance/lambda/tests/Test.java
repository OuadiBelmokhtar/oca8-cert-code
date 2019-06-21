package chap6.inheritance.lambda.tests;

import java.util.ArrayList;

interface Moveable {
    int move(int distance);
}

class Test {
	public static void main(String args[]) {
		// Test Moveable
		String name = "e" + "Ja /*va*/ v";
		System.out.println(name); // prints eJa /*va*/ v
		// main method
		Moveable moveable = (x) -> 10 + x; // define move() body
		System.out.println(moveable.move(20)); // prints 30
		
		//
		Emp e1 = new Emp("Shreya", 5, 9999.00);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2769.00);
		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		// Using an implementation class
		// filter(empArrList, new ValidatePerformanceRating());
		
		// Using an anonymous object
		filter(empArrList, new Validate() {
			@Override
			public boolean check(Emp emp) {
				return (emp.getPerformanceRating() >= 5);
			}
		});
	}

// Print validated employee
	static void filter(ArrayList<Emp> list, Validate rule) {
		for (Emp emp : list) {
			if (rule.check(emp)) {
				System.out.println(emp);
			}
		}
	}
}
