package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public interface Library {

	public default Items search(ArrayList<Items> library, String name) { // define method to search library
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).name.equals(name)) {
				return library.get(i);
			}
		}
		return null;
	}

	public default Customers search(ArrayList<Customers> customers, int iD) { // define method to search library
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).customerID == iD) {
				return customers.get(i);
			}
		}
		return null;
	}
	
	public default void addNew(Items t, ArrayList<Items> library) {		// add new item
		library.add(t);
	}
	
	public default void addNew(Customers c, ArrayList<Customers> customers) {	// add new customer
		customers.add(c);
	}
	
	public default void remove(ArrayList<Items> library, String remove) { // remove Items from library by name
		library.remove(search(library, remove));
		System.out.println("Item removed");
	}
	
	public default void remove(ArrayList<Customers> customers, int remove) { // remove Customers from library by name
		customers.remove(search(customers, remove));
		System.out.println("Customer removed");
	}

	public default void updateItemByName(ArrayList<Items> library, String update, String name, int iD, String author, int year, boolean onLoan,
			int loanExpiry) { // update Item
		Items x = search(library, update);
		x.setName(name);
		x.setID(iD);
		x.setAuthor(author);
		x.setYear(year);
		x.setOnLoan(onLoan);
		x.setLoanExpiry(loanExpiry);
		System.out.println("Item updated");
	}
	
	public default void updateCustomerByID(ArrayList<Customers> customers, int update, String forename, String surname, String dateOfBirth, 
			int customerID, String address1, String address2, String address3, String postCode) { // update a customer
		Customers y = search(customers, update);
		y.setForename(forename);
		y.setSurname(surname);
		y.setDateOfBirth(dateOfBirth);
		y.setCustomerID(customerID);
		y.setAddress1(address1);
		y.setAddress2(address2);
		y.setAddress3(address3);
		y.setPostCode(postCode);
		System.out.println("Customer updated");
	}
	
	public default void checkOutItem(ArrayList<Items> library, Customers c, String name) { // check out Item
		if (search(library, name).onLoan == false) {
			Items a = search(library, name);
			a.setOnLoan(true);
			a.setLoanExpiry(14);
			System.out.println("Item has been successfully loaned to " + c.forename + " " + c.surname
					+ " for 14 days. Please return within this period.");
		} else {
			System.out.println("Sorry, this item is already on loan");
		}
	}

	public default void checkInItem(Items t, Customers c) { // check in Item
		t.setOnLoan(false);
		t.setLoanExpiry(0);
		System.out.println("Thank you " + c.forename);
	}

	/*public default void emptyLibrary(ArrayList<Items> library) { // empty library NB: no test, not required functionality
		library.clear();
	}
	
	public default void emptyCustomers(ArrayList<Customers> customers) { // empty customers NB: no test, not required functionality
		customers.clear();
	}
	
	public default void outputLibrary(ArrayList<Items> library) { // print out library contents NB: no test, not required functionality
		for (Items t : library) {
			System.out.println(t.getClass());
			System.out.println("Name: " + t.name + " Author: " + t.author + " ID: " + t.iD + " Year published: "
					+ t.year + " On loan: " + t.onLoan + " Days remaining until booking expires: " + t.loanExpiry);
		}
	}

	public default void outputCustomers(ArrayList<Customers> customers) { // print out customers contents NB: no test, not required functionality
		for (Customers c : customers) {
			System.out.println("Forename: " + c.forename + " Surname: " + c.surname + " Date of birth: " + c.dateOfBirth
					+ " ID: " + c.customerID + " Address " + c.address1 + "\n" + c.address2 + "\n" + c.address3 + "\n"
					+ c.postCode);
		}
	}*/
	
	ArrayList<Items> libraryContents = new ArrayList<Items>();
	
	public default void writeContents(ArrayList<Items> library, PrintWriter write, String[] Z) { //write library contents to file
		for (Items t : library) {
			write.println(t.writeDetails());
			Z[library.indexOf(t)] = t.getClass().getSimpleName();
		}
	}
	
	public default void readToLibraryContents(Scanner scan, String[] Z, ArrayList<Items> libraryContents) {	//
		String line = "";
		int k=0;
		while (scan.hasNextLine() && (line = scan.nextLine()) != "") {
			if (line != "" && line != "\n"&& line.length() > 1) {
				String[] splitInput = line.split(", ");int parsedID = Integer.parseInt(splitInput[1]);
				int parsedYear = Integer.parseInt(splitInput[3]);
				boolean parsedOnLoan = Boolean.parseBoolean(splitInput[4]);
				int parsedLoanExpiry = Integer.parseInt(splitInput[5]);
				if (Z[k] == "Books") {
					boolean parsedFiction = Boolean.parseBoolean(splitInput[6]);
					boolean parsedEBook = Boolean.parseBoolean(splitInput[7]);
					boolean parsedAudioBook = Boolean.parseBoolean(splitInput[8]);
					boolean parsedForKids = Boolean.parseBoolean(splitInput[9]);
					libraryContents.add(new Books(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
							parsedLoanExpiry, parsedFiction, parsedEBook, parsedAudioBook, parsedForKids));
				} else if (Z[k]=="Magazines"){
					boolean parsedEMag = Boolean.parseBoolean(splitInput[6]);
					int parsedIssueNum = Integer.parseInt(splitInput[7]);
					libraryContents.add(new Magazines(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
							parsedLoanExpiry, parsedEMag, parsedIssueNum));
				} else if (Z[k]=="Maps") {
					libraryContents.add(new Maps(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
							parsedLoanExpiry, splitInput[6]));
				} else if (Z[k]=="Records") {
					boolean parsedDigitised = Boolean.parseBoolean(splitInput[6]);
					libraryContents.add(new Records(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
							parsedLoanExpiry, parsedDigitised, splitInput[7]));
				}
			}
			k++;
		}
	}
	
	public default void contents(ArrayList<Items> library, ArrayList<Items> libraryContents) {	//write contents to file, then read file to libraryContents
		try {
			String[] Z = new String[library.size()];
			
			PrintWriter write = new PrintWriter("C:\\Users\\Administrator\\Documents\\library.txt", "UTF-8");
			writeContents(library, write, Z);
			write.close();
	
			Scanner scan = new Scanner(new File("C:\\Users\\Administrator\\Documents\\library.txt"));
			readToLibraryContents(scan, Z, libraryContents);
			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
			e.printStackTrace();
		}
	}
}
