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
		System.out.println(i1.equals(i2)); // will return true because both are Integer objects and both have the value 1.
		i1.equals(b1) ; i1.equals(g1); // will return false because they are pointing to objects of different types.

	}

	static void ____() {

	}

	void $run() {

	}

	int rn() {

		return 0;
	}
}
