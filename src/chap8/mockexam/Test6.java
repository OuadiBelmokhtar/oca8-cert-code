package chap8.mockexam;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

	final int a;

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

		Runner runner1 = () -> System.out.println("running..."); // () et ; sont obligatoires
		Runner runner2 = () -> {
			System.out.println("running...");
			return; 
		};
		// Runner runner3 = -> System.out.println("running...")

		testRun(() -> System.out.println("running..."));

		String s1 = "abc ";// l1
		s1 = s1.concat(" def");// l2
		s1.replace('b', 'x'); // l3
		ArrayList list=new ArrayList();
		//list.add("a");
		System.out.println(list.size());

	}

	// valid functional interface since it has a single abstract method
	interface Runner {
		public void run();

	}

	static void testRun(Runner runner) {
		System.out.println("Test6.testRun()");
	}

}
