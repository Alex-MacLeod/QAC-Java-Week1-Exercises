package objects;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter value of n:");
		int n = scan.nextInt();							//enter value to be analysed
		
		int i=0;										//define i and dummy value k
		double k = n;
		
		while (!(k==1)) {								//loop until k==1
			i= i+1;
			k = (k/i);									//divide by i (# loops)
			if (k<1) {									//if fraction below 1, return NONE
				System.out.println("NONE");
				break;									//break loop if fraction
			}
		}
		if (k==1) {
		System.out.println("n is equal to " + i + "!"); //# loops = factorial
		}
	}

}
