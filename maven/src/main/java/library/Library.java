package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Main {

	ArrayList<Items> library = new ArrayList<Items>(); // create ArrayList "library"

	ArrayList<Customers> customers = new ArrayList<Customers>(); // create ArrayList "customers"

	public Items searchItem(ArrayList<Items> library, String name) { // define method to search library
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).name.equals(name)) {
				return library.get(i);
			}
		}
		return null;
	}

	public void checkOutItem(ArrayList<Items> library, Customers c, String name) { // check out Item
		if (searchItem(library, name).onLoan == false) {
			Items a = searchItem(library, name);
			a.setOnLoan(true);
			a.setLoanExpiry(14);
			System.out.println("Item has been successfully loaned to " + c.forename + " " + c.surname
					+ " for 14 days. Please return within this period.");
		} else {
			System.out.println("Sorry, this item is already on loan");
		}
	}

	public void checkInItem(Items t, Customers c) { // check in Item
		t.setOnLoan(false);
		t.setLoanExpiry(0);
		System.out.println("Thank you " + c.forename);
	}

	public void addItem(Items t) { // add new items
		library.add(t);
	}

	public void removeItemByName(ArrayList<Items> library, String remove) { // remove Items from library by name
		library.remove(searchItem(library, remove));
		System.out.println("Item removed");
	}

	/*public void emptyLibrary(ArrayList<Items> library) { // empty library
		library.clear();
	}

	public void outputLibrary(ArrayList<Items> library) { // print out library contents
		for (Items t : library) {
			System.out.println(t.getClass());
			System.out.println("Name: " + t.name + " Author: " + t.author + " ID: " + t.iD + " Year published: "
					+ t.year + " On loan: " + t.onLoan + " Days remaining until booking expires: " + t.loanExpiry);
		}
	}*/

	public void updateItemByName(ArrayList<Items> library, String update, String name, int iD, String author, int year, boolean onLoan,
			int loanExpiry) { // update Item
		Items x = searchItem(library, update);
		x.setName(name);
		x.setID(iD);
		x.setAuthor(author);
		x.setYear(year);
		x.setOnLoan(onLoan);
		x.setLoanExpiry(loanExpiry);
		System.out.println("Item updated");
	}

	public Customers searchCust(ArrayList<Customers> customers, int iD) { // define method to search library
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).customerID == iD) {
				return customers.get(i);
			}
		}
		return null;
	}
	
	public void addPerson(Customers c) {
		customers.add(c);
	}

	public void removeCustomerByID(ArrayList<Customers> customers, int remove) { // remove Customers from library by name
		customers.remove(searchCust(customers, remove));
		System.out.println("Customer removed");
	}

	/*public void emptyCustomers(ArrayList<Customers> customers) { // empty customers
		customers.clear();
	}

	public void outputCustomers(ArrayList<Customers> customers) { // print out customers contents
		for (Customers c : customers) {
			System.out.println("Forename: " + c.forename + " Surname: " + c.surname + " Date of birth: " + c.dateOfBirth
					+ " ID: " + c.customerID + " Address " + c.address1 + "\n" + c.address2 + "\n" + c.address3 + "\n"
					+ c.postCode);
		}
	}*/

	public void updateCustomerByID(ArrayList<Customers> customers, int update, String forename, String surname, String dateOfBirth, 
			int customerID, String address1, String address2, String address3, String postCode) { // update a customer
		Customers y = searchCust(customers, update);
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
	ArrayList<Items> libraryContents = new ArrayList<Items>();
	
	public void contents(ArrayList<Items> library, ArrayList<Items> libraryContents) {
		try {
			PrintWriter write = new PrintWriter("C:\\Users\\Administrator\\Documents\\library.txt", "UTF-8");

			for (Items t : library) {
				write.println(t.writeDetails());
				String Z = t.getClass().getSimpleName();
			}
			write.close();
	
			Scanner scanner = new Scanner(new File("C:\\Users\\Administrator\\Documents\\library.txt"));
			String line = "";
			while (scanner.hasNextLine() && (line = scanner.nextLine()) != "") {
				if (line != "" && line != "\n" && line.length() > 1) {
					String[] splitInput = line.split(", ");
					int parsedID = Integer.parseInt(splitInput[1]);
					int parsedYear = Integer.parseInt(splitInput[3]);
					boolean parsedOnLoan = Boolean.parseBoolean(splitInput[4]);
					int parsedLoanExpiry = Integer.parseInt(splitInput[5]);
					if (Z == "Books") {
						boolean parsedFiction = Boolean.parseBoolean(splitInput[6]);
						boolean parsedEBook = Boolean.parseBoolean(splitInput[7]);
						boolean parsedAudioBook = Boolean.parseBoolean(splitInput[8]);
						boolean parsedForKids = Boolean.parseBoolean(splitInput[9]);
						libraryContents.add(new Books(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
						parsedLoanExpiry, parsedFiction, parsedEBook, parsedAudioBook, parsedForKids));
					} else if (Z=="Magazines"){
						boolean parsedEMag = Boolean.parseBoolean(splitInput[6]);
						int parsedIssueNum = Integer.parseInt(splitInput[7]);
						libraryContents.add(new Magazines(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
								parsedLoanExpiry, parsedEMag, parsedIssueNum));
					} else if (Z=="Maps") {
						libraryContents.add(new Maps(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
								parsedLoanExpiry, splitInput[6]));
					} else if (Z=="Records") {
						boolean parsedDigitised = Boolean.parseBoolean(splitInput[6]);
						libraryContents.add(new Records(splitInput[0], parsedID, splitInput[2], parsedYear, parsedOnLoan,
								parsedLoanExpiry, parsedDigitised, splitInput[7]));
					}
				}
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
	}
}
