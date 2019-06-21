package chap8.mockexam;

import java.time.LocalDate;
import java.util.ArrayList;

import chap1.nonaccessmodifiers.staticandpolymorphysme.Test;

public class Tests {
	String name="instance var";
	
	void test() {
		
		if(true) {
			String name="first"; 
		}
		
		if(true) {
			String name="second";
		}
	}
	
	public static void main(String[] args) {
		
		float pi=3.14f;
		double pi1=3.14;
		double p=4.15f;
		double price ;
		String model;
		System.gc();
		Runtime.getRuntime().gc();
		double d=new Double(9.8);
		
		int Integer=0; // possible
		// The local variable model may not have been initialized
		System.out.println(model);
		System.out.println(price);

		// In this code, the compiler can be sure about
		// the initialization of the local variable model

		if (price > 10)
			model = "Smartphone";
		else
			model = "landline";
		System.out.println(model);// works

		// compiler sees that model var will never be initialized
		if (price > 10)
			model = "Smartphone";
		else if (price <= 10)
			model = "landline";
		System.out.println(model); // compilation error

		int i = 10;
		Integer I = 200;
		long l = 100;
		Long L = 500L;
		l = L; // Ok
		// i = L; // KO
		l = I;

		ArrayList<String> list = new ArrayList<>();
//
//		int area = 10;
//		String color;
//		if (area < 5)
//			color = "red";
//		if (area > 5) // value of area will not be known by compiler until run-time. As a result,
//						// compiler can't realize that this condition will be evaluated to true
//			color = "blue";
//		System.out.println(color); // Uninitialized variable

		int area = 10;
		String color;
		if (area < 5)
			color = "red";
		else
			color = "blue";
		// compiler is sure that at least one of the two
		// blocks of code (if or else) will be executed.
		System.out.println(color); // prints blue
		
		// Type mismatch: cannot convert from String to String[]
//		String ejg6[][]=new String[][]{"A","B"};
//StringBuilder sb=new StringBuilder("");
//LocalDate.now().plus(TemporalAmount amountToAdd)
	}
}
