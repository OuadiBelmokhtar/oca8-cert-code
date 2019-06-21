package chap6.inheritance.lambda.tests;

class ValidateName implements Validate {
	public boolean check(Emp emp) {
		return (emp.getName().startsWith("P"));
	}
}