package library;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Library l = new Library();
		
		Books b1 = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books b2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		Magazines mg1 = new Magazines("Coder's Digest July 2017", 56563, "Coder's Digest Ltd", 2017, false, 0, false, 3);
		Maps mp1 = new Maps("Map of Javaville", 6524, "Maps Inc", 2004, false, 0, "Javaville");
		Records r1 = new Records("Marriages in Womack County 1870-1890", 8342323, "Womack County", 1899, false, 0, true, "Marriage register");
		
		ArrayList<Items> library = new ArrayList<Items>();
		
		l.addNew(b1, library);
		l.addNew(b2, library);
		l.addNew(mg1, library);
		l.addNew(mp1, library);
		l.addNew(r1, library);
		
		Customers c1 = new Customers("Procopis", "Achilleos", "30/12/93", 45125, "10 Downing Street", "London", "England", "N12 Y76");
		Customers c2 = new Customers("David", "Jiang", "30/04/93", 46141, "24 Rowley Drive", "Sheffield", "Yorkshire", "SF4 9YT");
		Customers c3 = new Customers("David", "Clarkson", "30/04/63", 46132, "2 Park Drive", "Richmond", "Yorkshire", "RH4 9WE");
		
		ArrayList<Customers> customers = new ArrayList<Customers>();
		
		l.addNew(c1, customers);
		l.addNew(c2, customers);
		l.addNew(c3, customers);
		
		l.search(customers, 46141);
		l.search(library, "Java is fun");
		
		l.remove(library, "Marriages in Womack County 1870-1890");
		l.remove(customers, 46132);
		
		l.updateItemByName(library, "10 Ways that Learning Java makes you Cool", "10 Ways that Learning Java makes you Sexy",
				67836, "Elliot Womack", 2017, true, 10);
		l.updateCustomerByID(customers, 45125, "Procopis", "Achilleos", "30/11/93", 45125, "10 Maple Street", "London",
				"England", "N12 Y76");
		
		l.checkOutItem(library, c1, "Java is fun");
		l.checkInItem(b2, c2);
		
		ArrayList<Items> libraryContents = new ArrayList<Items>();
		
		l.contents(library, libraryContents);
	}
}