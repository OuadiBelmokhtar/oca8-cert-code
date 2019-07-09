package chap8.mockexam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tests3 {

	static {
		try {
			throw new NullPointerException();
			// Initializer does not complete normally
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private int c = 6;
	private int x = c > 2 ? 1 : 2;

	public static void main(String[] args) {

		// Predicate p=s->s.startsWith("a"); // sans type generique de Predicate, s est
		// par defaut Object!
		StringBuilder sb = new StringBuilder("abc");
		// sb.replace(start, end, str);
		String s = "abc";
		long l = 123;
		LocalTime localTime = LocalTime.of(12, 33);

		List<String> list = Arrays.asList("A", "B");// Returns a fixed-size list. You can not add or remove elts
//		list.add("c"); // throws UnsupportedOperationException
//		list.remove(1); // throws UnsupportedOperationException
		System.out.print("l1");
		System.out.println();
		System.out.print("l2");
		int i = 3;
		// float f1 = 2.3;

		int i4 = 1234567890;
		____();
		float f = 3.14f;
		System.out.println(f % 3);
//		
//		LocalDate.of
//		
		short so = Short.MAX_VALUE;

		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;

		System.out.println(i1 == i2); // will return false because both are pointing to different object. i
		System.out.println(i1 == i3); // will return true because one operand is a primitive int and so the other will
										// be unboxed and then the value will be compared.
		System.out.println(i1 == b1); // will not even compile because type of i1 and b1 references are classes that
										// are not in the same class hierarchy. So == knows at compile time itself that
										// they can't point to the same object.
		System.out.println(i1.equals(i2)); // will return true because both are Integer objects and both have the value
											// 1.
		i1.equals(b1);
		i1.equals(g1); // will return false because they are pointing to objects of different types.

		int i8 = 3;
		float f8 = i8;

		// Widening/Narrowing primitive conversion
		long l4 = 89687368736872L;
		l4 = 1000;

		float f4 = l4; // float bigger than long
		f4 = 10; // Ok, float bigger than int
		f4 = 10.5; // KO, double bigger than float

		double d4 = l4; // double bigger than long
		d4 = f4; // // double bigger than float

		int i5 = l4; // explicit cast needed, because long bigger than int

		char c4 = 'c'; // char is equivalent to int
		i5 = c4; // Ok, char is smaller than int
		c4 = i5; // KO, int is bigger than char
					// not compile because it is trying to assign an int to a char. Although the
					// value of i can be held by the char but since 'i' is not a constant but a
					// variable, implicit narrowing will not occur.
		c4 = l4;// long bigger than char

	}

	static void ____() {

	}

	void $run() {

		final int k = 10;
		byte b = k; // Okay because k is final and 10 fits into a byte
		final float f = 10.0;// will not compile because 10.0 is a double
								// even though the value 10.0 fits into a float
		int i = f;// will not compile.
	}

	int rn() {

		return 0;
	}
}
