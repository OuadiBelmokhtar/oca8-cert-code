package chap1.accessmodifiers.building;

import chap1.accessmodifiers.library.Book;

public class StoryBook extends Book {
	public StoryBook() {
		Book book = new Book();
		book.author = "ABC"; // can't be accessed by a base class's reference variable from separate package.
		author = "EFG"; // can be accessed through inheritance even from a separate package
		book.modifyTemplate(); // can't be accessed from a separate package,
								// because modifyTemplate() is declared as protected in Book
		StoryBook sb = new StoryBook();
		sb.author = "HIJ"; // can be accessed by a derived class's reference variable
	}

}
 