package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	ArrayList<Items> library = new ArrayList<Items>();			//create ArrayList "library"
	
	Items contents;
		public Library(Items contents) {						//add Item contents
			this.contents = contents;
		}
	public void addItem(Items t) {								//add Items to library
		library.add(t);
	}
	
	public void removeItemByName(String remove) {				//remove Items from library by name
		Scanner sc = new Scanner (System.in);
		System.out.println("Which item do you wish to remove?");
		remove = sc.nextLine();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).name == remove) {
				library.remove(i);
			} else { 
				System.out.println("Sorry, we could not find this item");
			}
		}
	}
	
	public void emptyLibrary() {								//empty library
		library.clear();
	}
	
	public void outputLibrary() {								//print out library contents
		for (Items t : library) {
			System.out.println(t.getClass());
			System.out.println("Name: " + t.name + " Author: "+ t.author + " ID: " + t.iD + " On reserve: " + t.isReserved + " Days remaining until booking expires: " + t.bookingExpiry);
		}
	}
	
	public void updateItemByName(String update) {				//update Item
		Scanner s = new Scanner (System.in);
		System.out.println("Which item do you wish to update?");
		update = s.nextLine();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).name == update) {
				
			} else {
				System.out.println("Sorry, we could not find this item");
			}
		}
	}
}
