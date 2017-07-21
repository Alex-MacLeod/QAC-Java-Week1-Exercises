package objects;
import java.util.ArrayList;
import java.util.List;

public class RunPaint {
	
	public static void main(String[] args) {
		Paint p1 = new Paint("CheapoMax", 19.99, 20, 10);										//create objects
		Paint p2 = new Paint("AverageJoes", 17.99, 15, 11);
		Paint p3 = new Paint("DuluxourousPaints", 25, 10, 20);
		
		Paint[] array = {p1, p2, p3};
		List<Paint> paint = new ArrayList<Paint>();												//create ArrayList of paints
		for (int i=0; i<array.length; i++) {													//add objects to ArrayList
			paint.add(array[i]);
			}
		int index = 0;
		double cheapest = 100000;																//define index and cheapest as numbers for min function
		for (int i=0; i<paint.size(); i++) {
			System.out.println("Painting the room with  " + paint.get(i).productName + " will cost £" + paint.get(i).paintRoom());
			if(paint.get(i).paintRoom() < cheapest) {
				cheapest = paint.get(i).paintRoom();											//by end of loop, cheapest will equal smallest cost
				index = i;																		//by end of loop, index will equal index of smallest cost
				}
		}
		System.out.println("Using " + paint.get(index).productName + " paint will cost the least for this room");		//find productName and print
		
	}
}
