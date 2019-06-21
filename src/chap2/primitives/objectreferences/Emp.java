package chap2.primitives.objectreferences;

public class Emp extends Person {
	@Override
	int m1() { // The return type is incompatible with Person.m1()
		return 1;
	}
}

