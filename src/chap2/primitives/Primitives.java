package chap2.primitives;

public class Primitives {

	public static void main(String[] args) {
		long l = 12000L; // L est facultatif
		float f = 13.4F; // cast via F obligatoire
		// boolean b=1; // ca marche pas
		int a = 288_398; // using underscore since Java7
		char c = 122; // unsigned(only positive) value can be assigned to a char var
		double $value = 9.50; // curenccy signs can be used as a valid identifier
		double £value = 11.50;
		System.out.println(a);
		System.out.println(c);

		// un int peut etre affecte a un long sans conversion
		int i2 = 10;
		long l2 = i2;
		
		int i = 5;
		byte b = 10;
		char k = 18;
		short s = 6;
		b = (byte) i; // sur-casting
		i = b; // sous-casting
		i = k;
		k = (char) i;
		i = s;
		s = (short) i;

		try {
			int v = 0;
			if (true) {
				v = 8; // accessible
				int v1 = 5; // if local scope
			}
			v1 = 40; // not accessible
		} catch (Exception e) {

		}
	}

}
