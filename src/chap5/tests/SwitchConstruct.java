package chap5.tests;

public class SwitchConstruct {
	public static void main(String[] args) {

//		String day = "SUN";
//		switch (day) {
//		default:
//			System.out.println("Invalid day?");
//		case "MON":
//		case "TUE":
//		case "WED":
//		case "THU":
//			System.out.println("Time to work");
//			break;
//		case "FRI":
//			System.out.println("Nearing weekend");
//			break;
//		case "SAT":
//		case "SUN":
//			System.out.println("Weekend!");
//			break;
//
//		}

		// You can define multiple cases, which should execute the same code block.
//		int score = 10;
//		switch (score) {
//		case 100:
//		case 50:
//		case 10:
//			System.out.println("Average score");
//			break;
//		case 200:
//			System.out.println("Good score");
//		}
//// equals to
//		if (score == 100 || score == 50 || score == 10)
//			System.out.println("Average score");
//		else if (score == 200)
//			System.out.println("Good score");
//
//		//
//		int x = 3;
//		switch (x) {
//		default:
//			System.out.println("Still no idea what x is");
//		case 1:
//			System.out.println("x is equal to 1");
//			break;
//		case 2:
//			System.out.println("x is equal to 2");
//			break;
//		case 3:
//			System.out.println("x is equal to 3");
//			break;
//
//		}

		byte foo = 120;
		switch (foo) {
		

		case 2:
			System.out.println("e");
		case 110:
			System.out.println("e");
			break;
		case 100:
			System.out.println("100");
		case 120:
			System.out.println("ejava");
		case 121:
			System.out.println("enum");
		case 127:
			System.out.println("guru");
		default:
			System.out.println("default");
			//break;
		}

	}
}
