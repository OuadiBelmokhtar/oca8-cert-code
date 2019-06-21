package chap7.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryCatches {

	public static void main(String[] args) {
		FileInputStream fis = null;
		// Yes it works in case of checked exceptions
		try { // outer try
			try { // inner try
					// The handler of FileNotFoundException isn't defined in this try block, as a
					// result the exception is propagated to the outer try
				fis = new FileInputStream("file.txt");
				// The handler of IOException is defined in the outer try
				fis.close();
			} catch (NullPointerException npe) {
				System.out.println("IOException");
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		} catch (IOException ioe) {

		}

	}

}
