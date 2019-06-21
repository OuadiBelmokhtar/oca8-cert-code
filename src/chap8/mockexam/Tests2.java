package chap8.mockexam;

public class Tests2 extends AbstractTest {

	private static void voi() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Tests2.voi()");
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println('A');
			throw new Exception();
		} catch (Exception e) {
			
			System.out.println("Tests2.voi()");
		}

	}

	public void m2() {

	}

	@Override
	protected int m1() {
		// TODO Auto-generated method stub
		System.out.println(super.name);
		super.m2();
		this.m2();
		return 0;
	}

}
