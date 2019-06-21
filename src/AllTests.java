import java.util.Arrays;
import java.util.List;

public class AllTests {
final protected int a=7;
private static final String h;

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(s1);
		stringBuilder.append(" ");
		stringBuilder.append(s2);
		String s3 = stringBuilder.toString();

		boolean x = false, z = false;
		x = !z;
		System.out.println(x);// prints true

		float d3 = 5; // ok

		int d, e = 5;
		d = e++; // affect avant d'incrémenter
		System.out.println(d);// prints 5
		System.out.println(e);// prints 6

		int s = 10, v = 10;
		final int w = 20;
//		switch (s) {
//		case w:
//			System.out.println("w");
//		case v: // case expressions must be constant expressions 
//			System.out.println("v");
//		case 30:
//			System.out.println("30");
//		}

		String[] arr = new String[] { "One", "Two", "Three" };
		System.out.println(arr.toString()); // prints [Ljava.lang.String;@7852e922
		System.out.println(Arrays.toString(arr)); // prints [One, Two, Three]

		List<String> list = Arrays.asList("Un", "Deux", "Trois");
		System.out.println(list);// prints [Un, Deux, Trois]

		String t1[] = { null };
		String t2[] = null;
		System.out.println(t1[0]); // prints null
		// System.out.println(t2[0]); // throws NPE
		// System.out.println(t1[1]); // Throws ArrayIndexOutOfBoundsException
		m1(10);
	}

	static void m1(final int a) {

		System.out.println("AllTests.m1()");
	};

	void m2() {
		m1(11);
		this.m1(10);
		AllTests.m1(20);
	}
	
//	int static  m3() {
//		return 0;
//	}

}
