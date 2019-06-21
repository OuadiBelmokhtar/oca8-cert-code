package chap7.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowExceptions {
	void method1() throws Error {
	}

	void method2() throws Exception {

	}

	void method3() throws Throwable {

	}

	void method4() throws RuntimeException {
	}

	void method5() throws FileNotFoundException {
	}

	void printArrValues(String[] arr) {
		try {

			System.out.println(arr[0] + ":" + arr[1]);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
			// Unreachable catch block for ArrayIndexOutOfBoundsException. It is already
			// handled by the catch block for IndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

	void UnOrderedCatches() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			fis.close();
		} catch (IOException ioe) {
			System.out.println("IOException");
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		}

	}

	void throwableMtd() {
		try {
			throw new FileNotFoundException();
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}

	void method6() {
		int a = 5;
		if (a == 0) {
			// Unhandled exception type FileNotFoundException
			// Add throws declaration or Surround with try/catch
			throw new Exception("can't be zero");
		}
	}
}
