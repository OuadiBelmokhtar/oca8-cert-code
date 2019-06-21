package chap7.tests;

public class ArithmethicException {
	public static void main(String[] args) {
		// Integer division
		System.out.println(77 / 0); // throws ArithmeticException: / by zero
		System.out.println(0 / 0); // throws ArithmeticException: / by zero
		// Decimal division
		System.out.println(77.0 / 0); // prints Infinity
		System.out.println(-77.0 / 0);// prints -Infinity
		System.out.println(77.0 / -0); // prints Infinity
		System.out.println(0.0 / 0); // prints NaN (Not a Number)
		System.out.println(-0.0 / 0); // prints NaN (Not a Number)
		System.out.println(0 / 0.0); // prints NaN (Not a Number)
		System.out.println(77 / 0.0); // prints Infinity
		System.out.println(77.0 / 0.0); // prints Infinity
		System.out.println(-77 / 0.0); // prints -Infinity
		System.out.println(-77.0 / 0.0); // prints -Infinity
		System.out.println(77 / -0.0); // prints -Infinity
		System.out.println(0.0 / 0.0); // prints NaN (Not a Number)
	}
} 
 