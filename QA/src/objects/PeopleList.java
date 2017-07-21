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
		People abdul= new People("Abdul", 24, "software developer");
		People donna= new People("Donna", 18, "student");
		People emily= new People("Emily", 76, "retiree");
		
		ArrayList<People> people = new ArrayList<People>();
		people.addAll(Arrays.asList(bob, colin, abdul,emily,donna));
		
		try {
			PrintWriter writer = new PrintWriter("C:\\Users\\Administrator\\Documents\\dummy.txt", "UTF-8");
		
			for (People i:people) {
				writer.println(i.toString());
				}
			writer.close();
		}	catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
		
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Administrator\\Documents\\dummy.txt"));
			ArrayList<People> persons = new ArrayList<People>();
			while (scanner.hasNextLine()){
				String[] splitInput = scanner.nextLine().split(" ");
				for (int i=0; i<splitInput.length; i++) {
					int parsedInput = Integer.parseInt(splitInput[1+i]);
					persons.add(new People(splitInput[0+i], parsedInput, splitInput[2+i]));
				}
			}
			scanner.close();
			
			System.out.println(persons.get(0).age);
		
		}	catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (@SuppressWarnings("hiding") IOException e) {
			System.out.println("Error initializing stream");
		}
		
	}
}
