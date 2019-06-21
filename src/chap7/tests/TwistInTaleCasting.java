package chap7.tests;

class Ink {}
interface Printable {}
class ColorInk extends Ink {
	int rgb;
}
class BlackInk extends Ink {}

public class TwistInTaleCasting {

	public static void main(String[] args) {
		Printable printable=null;
		ColorInk ci;
		BlackInk blackInk = new BlackInk();
		// compiles successfully, but causes a ClassCastException at runtime
		printable = (Printable) blackInk;
		//printable = blackInk; // compilation error
		System.out.println(ci);
	}
}


