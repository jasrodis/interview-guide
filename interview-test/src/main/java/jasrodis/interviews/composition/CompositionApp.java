package jasrodis.interviews.composition;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompositionApp {

	private static final Logger log = LoggerFactory.getLogger(CompositionApp.class);

	public static void main(String... args) {

		// Creating the Objects of Book class.
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains the no. of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library library = new Library(books);

		List<Book> bks = library.getTotalBooksInLibrary();
		for (Book bk : bks) {
			log.info("The title is : [{}] and the author is : [{}]", bk.getTitle(), bk.getAuthor());
		}
	}

}
