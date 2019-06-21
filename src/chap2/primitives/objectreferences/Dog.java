package chap2.primitives.objectreferences;

class Collar {
}

public class Dog {
	Collar c;
	String name;

	public static void main(String[] args) {
		Dog d;
		d = new Dog();
		d.go(d);
		System.out.println(d.name);
	}

	void go(Dog dog) {
		c = new Collar();
		dog.setName("Aiko");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
