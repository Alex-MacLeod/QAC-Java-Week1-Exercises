package testJavaTasks;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

import library.Books;
import library.Customers;
import library.Items;
import library.Main;

@SuppressWarnings("unused")
public class LibraryTest {
	
	Main test = new Main();
	
	@Test
	public void testAddNew() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		
		test.addNew(testBook, testIArray);
		assertEquals(testBook.getAuthor(), testIArray.get(0).getAuthor());
		
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		
		test.addNew(dummy, testCArray);
		assertEquals(dummy.getCustomerID(), testCArray.get(0).getCustomerID());
	}
	
	@Test
	public void testSearch() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		
		testIArray.add(testBook);
		assertEquals(test.search(testIArray, "Java is fun"), testBook);
		
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		
		testCArray.add(dummy);
		assertEquals(test.search(testCArray, 45125), dummy);
	}
	
	@Test
	public void testRemove() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook);
		testIArray.add(testBook2);
		
		test.remove(testIArray, "Java is fun");
		assertEquals(1,testIArray.size());
		
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		Customers dummy2 = new Customers("David", "Jiang", "30/04/93", 46141, "24 Rowley Drive", "Sheffield", "Yorkshire", "SF4 9YT");
		testCArray.add(dummy);
		testCArray.add(dummy2);
		
		test.remove(testCArray, 45125);
		assertEquals(1,testCArray.size());
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
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		testIArray.add(testBook);
		
		test.checkOutItem(testIArray, dummy, "Java is fun");
		assertEquals(true, testBook.isOnLoan());
		assertEquals(14, testBook.getLoanExpiry());
	}

	@Test
	public void testCheckInItem() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		testIArray.add(testBook2);
		
		test.checkInItem(testBook2, dummy);
		assertEquals(false, testBook2.isOnLoan());
		assertEquals(0, testBook2.getLoanExpiry());
	}
	
	@Test
	public void testUpdateItemByName() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook2);
		
		test.updateItemByName(testIArray, "10 Ways that Learning Java makes you Cool", "10 Ways that Learning Java makes you Sexy",
				67836, "Elliot Womack", 2017, true, 10);
		assertEquals("Elliot Womack", testIArray.get(0).getAuthor());
		assertEquals("10 Ways that Learning Java makes you Sexy", testIArray.get(0).getName());
	}
	
	@Test
	public void testUpdateCustomerByID() {
		ArrayList<Customers> testCArray = new ArrayList<Customers>();
		Customers dummy = new Customers("Procopis", "Achilleos", "30th December 1993", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		testCArray.add(dummy);
		
		test.updateCustomerByID(testCArray, 45125, "Procopis", "Achilleos", "30/12/93", 45125, "10 Downing Street", "London",
				"England", "N12 Y76");
		assertEquals("30/12/93", testCArray.get(0).getDateOfBirth());
	}
	
	@Test
	public void testWriteContents() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		PrintWriter testWrite = null;
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook);
		testIArray.add(testBook2);
		String[] A = new String[testIArray.size()];
		try {
			testWrite = new PrintWriter("C:\\Users\\Administrator\\Documents\\test.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		test.writeContents(testIArray, testWrite, A);
		assertEquals(testBook2.getClass().getSimpleName(), A[1]);
	}
	
	@Test
	public void testReadToContents() {
		ArrayList<Items> testArrayReadToContents = new ArrayList<Items>();
		Scanner testScan = null;
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		String[] A = {"Books"};
		try {
			testScan = new Scanner(new File("C:\\Users\\Administrator\\Documents\\test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		test.readToLibraryContents(testScan, A, testArrayReadToContents);
		assertEquals(testBook.getID(), testArrayReadToContents.get(0).getID());
	}
	
	@Ignore
	public void testContents() {
		ArrayList<Items> testIArray = new ArrayList<Items>();
		ArrayList<Items> testArrayContents = new ArrayList<Items>();
		Books testBook = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books testBook2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		testIArray.add(testBook);
		testIArray.add(testBook2);
		
		test.contents(testIArray, testArrayContents);
		assertEquals(testBook2.getID(), testArrayContents.get(0).getID());
	}
}
