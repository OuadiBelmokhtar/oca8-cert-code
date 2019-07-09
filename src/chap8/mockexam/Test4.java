package chap8.mockexam;

public class Test4 {

	// String s='a'; // KO, Type mismatch: cannot convert from char to String
	// String s1='abc'; // KO, Invalid character constant

	String s2 = this.toString();// OK, accessible ds la partie de declaration globale

	public static void main(String[] args) {
		String s = null;
		s = s + "abc";
		System.out.println(s);// prints nullabc

		// vérifie si la val littérale de s existe ds le pool, sa réf sera retourné.
		// Sinon, csa val littérale sera ajouté au pool.
		System.out.println(s.intern());

		int i;
		int j;
		for (i = 0, j = 0; j < i; ++j, i++) {
			System.out.println(i + " " + j);
		}

		System.out.println(i + " " + j);// compiles

		boolean b1 = true | false;
		boolean b2 = true || false;
		System.out.println(b1 + " " + b2); // trus true
		Object o = new Object(); // Object is not abstract

		Object t = new Integer(107);
		// The method intValue() is undefined for the type Object
		int k = (Integer) t.intValue() / 9;
		System.out.println(k);

	}

	static void testScopeVarInSwitch(int x) {

		switch (x) { // Syntax error on token "{", SwitchLabels expected after this token
		boolean b = false; 
		case 0:
			// b is declared in the switch block.
								// It is accessible within all the switch block.
			break;
		case 1:
			b = true; // no problem here, b is in scope for the rest of the switch block.
						// It will be out of scope after the switch block ends.
			break;
		}

		if (b) // here b is out of scope
			System.out.println("ok");

	}
	
	private void m() {
	
		
	}; // Ok

}
