import java.util.Scanner;

public class InstantToSenconds {
	public static void main(String[] args) {
		int h, m, s, nbrS;
		Scanner in = new Scanner(System.in);
		System.out.println("H=");
		h = in.nextInt();
		System.out.println("M=");
		m = in.nextInt();
		System.out.println("S=");
		s = in.nextInt();
		// System.out.println(instantToSeconds());
		System.out.println(secondToInstant(instantToSeconds(h,m,s)));
	}

	static int instantToSeconds(int h, int m, int s) {
		return h * 3600 + m * 60 + s;
	}

	static StringBuilder secondToInstant(int nbrS) {
		int h, m, s;
		h = nbrS / 3600;
		m = (nbrS % 3600) / 60;
		s = m % 60;

		StringBuilder sb = new StringBuilder();

		return sb.append(h).append("h").append(m).append("m").append(s).append("s");
	}
}
