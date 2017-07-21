package testJavaTasks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import library.Books;
import library.Items;

public class LibraryTest {
	

	ArrayList<Items> testArray = new ArrayList<Items>();
	Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
	
	@Test
	public void testAddItem() {
	//	Library testAddItem = new Library(testBook);
	//	testAddItem.addItem(testBook);
	//	assertEquals(testBook.getAuthor(), testAddItem.get(0).Author());
	}

}
