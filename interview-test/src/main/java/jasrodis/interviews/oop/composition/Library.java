package jasrodis.interviews.oop.composition;

import java.util.List;

public class Library {

	private final List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {
		return books;
	}

}