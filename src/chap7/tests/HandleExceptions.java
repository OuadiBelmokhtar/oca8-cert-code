package chap7.tests;

import java.io.FileNotFoundException;

public class HandleExceptions {
	void method6() {
		try {
		} catch (Error e) {
		}
	}

	void method7() {
		try {
			// Possible, car Exception est condidere Checked et Unchecked
		} catch (Exception e) {
		}
	}

	void method8() {
		try {
		} catch (Throwable e) {
		}
	}

	void method9() {
		try {
		} catch (RuntimeException e) {
		}
	}

	void method10() {
		try {
			// Unreachable catch block for FileNotFoundException. This exception is never
			// thrown from the try statement body
		} catch (FileNotFoundException e) {
		}
	}
}

