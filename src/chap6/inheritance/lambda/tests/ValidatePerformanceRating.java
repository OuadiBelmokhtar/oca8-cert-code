package chap6.inheritance.lambda.tests;

class ValidatePerformanceRating implements Validate {
	public boolean check(Emp emp) {
		return (emp.getPerformanceRating() >= 5);
	}
}