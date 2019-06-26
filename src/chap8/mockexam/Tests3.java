package chap8.mockexam;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tests3 {
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

		____();

	}

	static void ____() {

	}

	void $run() {

	}

	void rn() {

	}
}
