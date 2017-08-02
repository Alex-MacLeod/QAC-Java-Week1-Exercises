package garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {
	public static void main(String[] args) {
		Car c1 = new Car("Ford", 150, 560, "unleaded", "grey", false, 300, 15046, false, "Fiesta", "AB1 3CK", true, false, false);					//create objects
		Car c2 = new Car("Lamborghini", 250, 2460, "unleaded", "yellow", false, 1750, 335, true, "Aventador", "M0N 33Y", false, false, true);
		Lorry l1 = new Lorry("Volvo", 100, 600, "diesel", "blue", false, 530, 24405, true, "FH12", "GR1 3TY", false, 1500, 15);
		Motorcycle m1 = new Motorcycle("Suzuki", 175, 360, "unleaded", "black", true, 250, 3460, true, "Hayabusa", "AI1 0WW", true, true);
		
		Vehicle[] array = {c1, c2, l1, m1};
		List<Vehicle> garage = new ArrayList<Vehicle>();														//create ArrayList
		for (int i=0; i<array.length; i++) {																//add objects to ArrayList
			garage.add(array[i]);
			}
		
		for (int v=0; v<garage.size(); v++) {
	    	if("M0N 34Y".equals(garage.get(v).numberPlate))															//remove objects from ArrayList
	    		garage.remove(v);
			}
	    
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);																//remove objects from ArrayList (using Scanner, console)
		System.out.println("Which car do you wish to remove?");
		String input = sc.nextLine();
		for (int v=garage.size()-1; v>=0; v--) {
			if (garage.get(v).numberPlate == input)
				garage.remove(v);
			}
	    
	   	 for (int v=garage.size()-1; v>=0; v--) {															//remove all objects
	    		garage.remove(v);
			}
	    
	 	 for (int v=0; v<garage.size(); v++) {																//print repair costs
	    		if(garage.get(v).needsRepair)
	    			System.out.println("Repairing the " + garage.get(v).make + " " + garage.get(v).model + " will cost £" + garage.get(v).repairCost());
	  		}
	    
	         if (garage.isEmpty()) {
			System.out.println("No vehicles in garage.");														//print if garage is empty
		 } else {
			for (int j=0; j<garage.size(); j++) {
				System.out.println("The total monthly cost of running the " + garage.get(j).make + " " + garage.get(j).model + " is £" + garage.get(j).totalCost());		//print total running costs
			}
		 }
	}
}
