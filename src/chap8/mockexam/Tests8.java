package chap8.mockexam;

public class Tests8 {
	static int[] x = new int[0];
	{
		x[0] = 10;
	}

	public static void main(String[] args) {
		// byte b = 300; // cannot convert from int to byte, a cast to byte is needed
		byte b1 = (byte) 300;
		System.out.println(b1); // prints 44
		int a = 30 / 2 / 2;
		System.out.println(a);

		// int i = 0;

		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println("i apres la boucle" + i); // inaccessible
		// Integer i1 = 1, i2 = 1;

		Integer i1 = new Integer(1);
		Integer i2 = 1;
		System.out.println(i1 == i2);// prints false, because the creation of 
									// i1 create a new object, and do not use cache

	}
}
