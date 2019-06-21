package chap1.accessmodifiers.library; 
public class Book {
protected String author;
protected void modifyTemplate() {} 
// pr tester la redefinition
protected final void print() {
	System.out.println("Book.print()");
}

}