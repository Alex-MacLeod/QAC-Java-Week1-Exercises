//19 Working with files

package objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PeopleList {
	public static void main(String[] args) {
		People bob = new People("Bob", 45, "builder");
		People colin = new People("Colin", 34, "civil servant");
		People abdul = new People("Abdul", 24, "software developer");
		People donna = new People("Donna", 18, "student");
		People emily = new People("Emily", 76, "retiree");

		ArrayList<People> people = new ArrayList<People>();
		people.addAll(Arrays.asList(bob, colin, abdul, emily, donna)); 					// create array of 5 people

		try { 																			// begin try/catch to allow exceptions
			PrintWriter writer = new PrintWriter("C:\\Users\\Administrator\\Documents\\dummy.txt", "UTF-8"); // define PrintWriter, choose document

			for (People i : people) {
				writer.println(i.peopleWrite()); 										// write details into documents
			}
			writer.close(); 															// stop writing
		} catch (FileNotFoundException e) { 											// exceptions
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}

		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Administrator\\Documents\\dummy.txt")); // scan from file
			ArrayList<People> persons = new ArrayList<People>(); 						// create new ArrayList to be read into
			String line = "";
			while (scanner.hasNextLine() && (!"".equals(line = scanner.nextLine()))) {
				if ( !"".equals(line) && !"\n".equals(line) && line.length() > 1) {					//remove spaces/line breaks
					String[] splitInput = line.split(", "); 							// separating by ", ", split each line into an array of 3
					int parsedInput = Integer.parseInt(splitInput[1]);					//parse 2nd elements into int
					persons.add(new People(splitInput[0], parsedInput, splitInput[2])); //add new objects in new ArrayList
				}
			}
			scanner.close();

			System.out.println(persons.get(4).age);										//check: get age from persons

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (@SuppressWarnings("hiding") IOException e) {
			System.out.println("Error initializing stream");
		}

	}
}
