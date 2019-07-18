package chap8.mockexam;

public class Test6 {

	public static void main(String args[]) {
		boolean b = false;
		int i = 1;
		do {
			i++;
		} while (b = !b);
		System.out.println(i);
		System.out.println(b);
		System.out.println(b = !b);
		
		int[] t = { 1, 2, 3 };
		System.out.println(t.getClass());// prints class [I
	}

}
