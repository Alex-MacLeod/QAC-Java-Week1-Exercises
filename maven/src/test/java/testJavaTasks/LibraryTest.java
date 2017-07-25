package testJavaTasks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import library.Books;
import library.Customers;
import library.Items;
import library.Library;

public class LibraryTest {
	
	@Test
	public void testAddItem() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		testIArray.add(testBook);
		assertEquals(testBook.getAuthor(), testIArray.get(0).getAuthor());
	}
	
	@Test
	public void testSearchItem() {
		Library testSearchItem = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		testIArray.add(testBook);
		assertEquals(testSearchItem.searchItem(testIArray, "Java is fun"), testBook);
	}
	
	@Test
	public void testLibrarySize() {
	ArrayList<Items> testIArray = new ArrayList<Items>();
	Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
	testIArray.add(testBook2);
	assertEquals(1,testIArray.size());
	}
	
	@Test
	public void testCheckOutItem() {
		Library testCheckOutItem = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		testIArray.add(testBook);
		testCheckOutItem.checkOutItem(testIArray, dummy, "Java is fun");
		assertEquals(true, testBook.isOnLoan());
		assertEquals(14, testBook.getLoanExpiry());
	}

	@Test
	public void testCheckInItem() {
		Library testCheckInItem = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		testIArray.add(testBook2);
		testCheckInItem.checkInItem(testBook2, dummy);
		assertEquals(false, testBook2.isOnLoan());
		assertEquals(0, testBook2.getLoanExpiry());
	}
	
	@Test
	public void testRemoveItemByName() {
		Library testRemoveItemByName = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook);
		testIArray.add(testBook2);
		testRemoveItemByName.removeItemByName(testIArray, "Java is fun");
		assertEquals(1,testIArray.size());
	}
	
	@Test
	public void testUpdateItemByName() {
		Library testUpdateItemByName = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook2);
		testUpdateItemByName.updateItemByName(testIArray, "10 Ways that Learning Java makes you Cool", "10 Ways that Learning Java makes you Sexy",
				67836, "Elliot Womack", 2017, true, 10);
		assertEquals("Elliot Womack", testIArray.get(0).getAuthor());
		assertEquals("10 Ways that Learning Java makes you Sexy", testIArray.get(0).getName());
	}
	
	@Test
	public void testAddPerson() {
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		assertEquals(dummy.getCustomerID(), testCArray.get(0).getCustomerID());
	}

	@Test
	public void testSearchCust() {
		Library testSearchCust = new Library();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		assertEquals(testSearchCust.searchCust(testCArray, 45125), dummy);
	}
	
	@Test
	public void testRemoveCustomerByID() {
		Library testRemoveCustomerByID = new Library();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		Customers dummy2 = new Customers("David", "Jiang", "30/04/93", 46141, "24 Rowley Drive", "Sheffield", "Yorkshire", "SF4 9YT");
		testCArray.add(dummy);
		testCArray.add(dummy2);
		testRemoveCustomerByID.removeCustomerByID(testCArray, 45125);
		assertEquals(1,testCArray.size());
	}
	
	@Test
	public void testUpdateCustomerByID() {
		Library testSearchCust = new Library();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		testSearchCust.updateCustomerByID(testCArray, 45125, "Procopis", "Achilleos", "30/12/93", 45125, "10 Downing Street", "London",
				"England", "N12 Y76");
		assertEquals("30/12/93", testCArray.get(0).getDateOfBirth());
	}
	
	@Test
	public void testContents() {
		Library testContents = new Library();
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Items> testArrayContents = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		//Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook);
		testContents.contents(testIArray, testArrayContents);
		//assertEquals(testBook.getID(), testArrayContents.get(0).getID());
	}
}
