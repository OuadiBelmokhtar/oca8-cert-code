package chap1.tests;

import chap8.mockexam.AbstractTest;

class T1 extends AbstractTest{
	protected int m1() {
		return 9;
	}
}

public class Tests {

	public static final int MAX_AGE = 90;
	final static public int MIN_AGE = 1;
	String name;

	public static void main(String[] args) {

//		int b=10;System.out.println(b++);
//		System.out.println(b);
//		int a = 10;
//		a = a++ + a + a-- - a-- + ++a;
//		System.out.println(a); // 32

//		int x = 10; int y = 20;
//		boolean b = x == y;
//		System.out.println(b);
//		
//		boolean b1 = false; 
//		System.out.println(b1 = true);
//		System.out.println(b1);

//		int a = 10;
//		int b = 20;
//		int c = 40;
//		
//		System.out.println(a >= 99 || a <= 33 && b == 10);
//		System.out.println(a >= 99 && a <= 33 || b == 10);
//		System.out.println("xor " + ((2<3) ^ (4>3))); // XOR operator
//		int int1 = 10, int2 = 20, int3 = 30; 
//		System.out.println(int1 % int2 * int3 + int1 / int2);
//		int a=5, b=4, c=2;
//		int s=a*(b+c);
//		System.out.println(s);
		// The case of a compound operator
		int x = 2;
		// x = x * 2 + 5; // prints 9. because of multiplication precedence, the
		// expression will be
		// evaluated as x=(x*2)+5

		x *= 2 + 5; // prints 14. Because of assignment (*=) operator associativity (right to left),
					// the expression on the right is placed inside parentheses. As a result it will
					// be evaluated as x=x*(2+5). wish get 14
		
//		System.out.println("x=" + x);
//		Number n;
//		// *** Wrappers, autoboxin, unboxing ***//
//		Integer i = Integer.valueOf(99);
//		Integer i0 = new Integer(20);
//		Integer i2 = 33;
//		i0 = Integer.valueOf(9);
//		Integer i3 = i.intValue();
//		Integer i4 = Integer.parseInt("299");
//		System.out.println("i0=" + i0);
//
//		Integer s = Integer.valueOf(2);
//		s += 1; // Integer is immutable !
//		System.out.println("s=" + s); // s=3
//
//		char myChar = 97;
//		char yourChar = 98;
//		System.out.print(myChar + yourChar);
//
//		long a3 = 0x10C;
//
//		Integer t = new Integer(10);
//		Integer h = new Integer(20);
//		System.out.println("avant permutation, t:" + t + " h:" + h);
//		permuterWrapper(t, h);
//		System.out.println("après permutation, t:" + t.intValue() + " h:" + h.intValue());
		
		//
		
		
	}

	static void permuterWrapper(Integer a, Integer b) {
		Integer x = a;
		a = b;
		b = x;
	}

	static void permuterPrimitive(int a, int b) {

		int x = a;
		a = b;
		b = x;
	}

	void afficher(String name) {
		name = "";
	}

	
}
