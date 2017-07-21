package objects;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	public static void main(String[] args) {
		
		String f = " ";
		int min = 0;
		int max = 100;
		Random random = new Random();								//Create random object using import
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);           			
        int guess = 50;												//set initial guess as 50
        System.out.println ("Hello!");
        System.out.println ("My first guess is " + guess + ".");
        while (!(f.equals("CORRECT"))) {							//loop until CORRECT
			System.out.println ("Is it HIGHER, LOWER, or CORRECT?");
			f = scan.nextLine();									//enter string into console
			if (f.equals("LOWER")) {
        		max = guess;										//if LOWER, set max to latest guess
        	} else if (f.equals("HIGHER")) {
        		min = guess;										//if HIGHER, set min to latest guess
        	} else if (f.equals("CORRECT")) {
        		break;												//leave loop if CORRECT
        	} else {
        		System.out.println ("Sorry, I didn't understand that.");
        		continue;											//loop back to choice if anything else is entered
        	}
			int randomNum = random.nextInt(max-min);
			int r = (int) (min + randomNum);
			guess = r;												//determine next guess using Random import and min/max
			System.out.println ("My next guess is " + guess + ".");
        }
        System.out.println ("Hooray! That was a fun game!");		//end of game
	}
}
