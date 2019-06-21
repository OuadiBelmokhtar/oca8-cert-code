package chap3.variablesscope;

/**
 * to test the shadowing concept
 * 
 * @author ouadi
 *
 */
class Phone {
	{
		// code to execute at each time the class is instantiated
	}

	static {
		// code to execute at first load of the class
	}
	
	String phoneNumber = "123456789";

	void setNumber() {
		
		String phoneNumber;
		
		
		// phoneNumber = "987654321";
	}
	Phone(String val) {
        specialization = val;
    }
	String specialization;
    String getSpecialization() { return specialization; }

}

class TestPhone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setNumber();
		System.out.println(p1.phoneNumber); // print the defaut value
	}
}
