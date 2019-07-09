package chap6.inheritance.tests;

public interface I1 {
	default int m1() {
		return 1;
	}

	// This method requires a body instead of a semicolon
	static void m2();
}
