package chap6.inheritance.lambda.tests;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestWithLambda {
	public static void main(String args[]) {
		Emp e1 = new Emp("Shreya", 5, 9999.00);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2769.00);
		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);

		Validate validatePerformance = e -> e.performanceRating >= 5;
		Validate validateSalary = e -> e.getSalary() >= 2000.00;

		System.out.println("Performance Validation");
		// Passing code to method
		// Referred execution concept. Passed code will be executed later when calling
		// check() within filter()
		filter(empArrList, e -> e.performanceRating >= 5);
		System.out.println("Salary Validation");
		filter(empArrList, validateSalary);
	}

// Print validated employee
	// this method is very general, it can check for any validation. This is good design. It
	// shouldn’t need to know what specifically we are searching for in order to
	// print a list of employee.
	static void filter(ArrayList<Emp> list, Validate rule) {
		for (Emp emp : list) {
			if (rule.check(emp)) {
				System.out.println(emp);
			}
		}
	}
}
