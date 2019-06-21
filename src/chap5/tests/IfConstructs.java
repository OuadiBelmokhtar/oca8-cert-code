package chap5.tests;

public class IfConstructs {

	public static void main(String[] args) {
		int score = 300;
		String result = "";

		if (score == 100)
			result = "A";
		else if (score == 50)
			result = "B";
		else if (score == 10)
			result = "C";
		else
			result = "F";

		System.out.println("result case1:" + result); // F
		// equals to
		if (score == 100) {// 1
			result = "A";
		} // 1
		else {// 2
			if (score == 50) {// 3
				result = "B";
			} // 3
			else {// 4
				if (score == 10) {// 5
					result = "C";
				} // 5
				else {// 6
					result = "F";
				} // 6
			} // 4
		} // 2
		System.out.println("result case2:" + result); // F

		/*
		 * using assignment in if condition if((score+=5)==400) {
		 * 
		 * }
		 */

		boolean testValue = false;
		if (!testValue) // la negation de if(testValue) <=> if(testValue==false)
			System.out.println("false");

		// syntaxe correcte
		if (testValue == true)
			;
		else
			System.out.println("value is false");

		// syntaxe correcte sans {}
		if (score > 200)
			if (score < 400) // ce if est considere comme une seule instruction
				if (score > 300)
					System.out.println(1);
				else
					System.out.println(2);
			else
				System.out.println(3);

		// nested ternary conditions
		int bill = 2000;
		int qty = 10;
		int days = 10;
		int discount = (bill > 1000) ? (qty > 11) ? 10 : 9 : 5;// eg1
		System.out.println(discount); // 9
		discount = (bill > 1000) ? (qty > 11) ? 10 : days > 9 ? 20 : 30 : 5;
		System.out.println(discount); // 20
	}
}