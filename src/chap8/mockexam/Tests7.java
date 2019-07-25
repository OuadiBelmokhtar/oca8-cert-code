package chap8.mockexam;

public class Tests7 {
	static boolean a;
	static boolean b1;
	static boolean c1;

	public static void main(String[] args) {

		// comparing diff types of primitive vars
		int i = 9;
		short s = 5;
		Integer I = 10;
		byte b = 9;
		char c = 5;
		System.out.println(i == b); // prints true
		System.out.println(c == s); // prints true

		Byte B = 10;
		Number N = 10;
		// System.out.println(I == B); // Incompatible operand types Integer and Byte
		System.out.println(I == N); // prints true

		System.out.println(I == s); // prints false

		boolean bool = (a = true) || ((b1 = true) && (c1 = true));
		// if ((a = true) || (b1 = true) && (c1 = true))
		System.out.println(a + ", " + b1 + ", " + c1);

		int i2 = 1____3; // OK
		System.out.println(i2); // prints 13

		int i5 = 10;
		// The method println(boolean) in the type PrintStream
		// is not applicable for the arguments (void)
		// System.out.println(i < 20 ? out1() : out2());

		StringBuilder sb = new StringBuilder("12345678");
		sb.setLength(5);
		sb.setLength(10);
		System.out.println(sb.length()); // prints 10
		System.out.println(sb);// prints "12345     " 5 spaces inside
		
		System.out.println("blooper".substring);
	}

	private static void out2() {
	}

	private static void out1() {
	}
}
