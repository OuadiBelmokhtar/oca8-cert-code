package chap8.mockexam;

import java.util.Arrays;

public class Tests5 {

	private final int AB;

	{
		// AB = 10;
	}

	public Tests5() {
		AB = 3;

		// A constant holding a Not-a-Number (NaN) value of type float and double.
		System.out.println(Float.NaN);
		System.out.println(Double.NaN);
		Double d = 9;
		System.out.println(d.NaN);
	}

//
//
	public static void main1(String[] args) {

//		try {
//
//			doTest();// throws ArrayIndexOutOfBoundsException
//		} catch (MyException me) {// does not catch the thrown exception
//			System.out.println("MyException catch block: " + me);
//		}
//
//		System.out.println(true); // OK, print true
//		System.out.println(null); // Comp Err
//		System.out.println(true + null); // Comp Err
//		System.out.println(null + null); // Comp Err
//		System.out.println(null + "null"); // OK, print nullnull

		int k = 1;
		k += (k = 4) * (k + 2);
		System.out.println(k);// 25 not 28

	}

	static void doTest() throws MyException {
		int[] array = new int[10];
		System.out.println(Arrays.toString(array));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		array[10] = 1000;
	}

	public void method1(int i) {
		int j = (i * 30 - 2) / 100;

		POINT1: for (; j < 10; j++) { // this is the labeled block
			boolean flag = false;
			while (!flag) {
				if (Math.random() > 0.5)
					break POINT1;
			}
		}
		while (j > 0) {
			System.out.println(j--);
			// if (j == 4)
			// break POINT1;// The label POINT1 is missing
		}
	}

	public static void printSum(int a, int b) {
		System.out.println("In int " + (a + b));
	}

	public static void printSum(Integer a, Integer b) {
		System.out.println("In Integer " + (a + b));
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void main(String[] args) {
		printSum(1, 2); // calls printSum(int, int)
	}
}

class MyException extends Exception { // is a checked exception
	public MyException(String msg) {
		super(msg);

	}
}
