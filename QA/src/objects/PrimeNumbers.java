package objects;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
	
		int k, m, n;
		@SuppressWarnings("unused")
		String f = " ";
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);           
        System.out.println ("Enter upper limit: "); 
        n = scan.nextInt();
        System.out.println ("Do you wish to specify a lower limit? YES / NO "); 
        f = scan.nextLine();
        if (scan.nextLine().equals("YES")) {
        	m = scan.nextInt();
        } else {
        	m = 2;
        }
        long startTime = System.currentTimeMillis();
        System.out.println ("The prime numbers in between the entered limits are :");
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (int i=m; i<n; i++) {
			int counter=0; 			  
		    if (i==2) {
		    	primes.add(i);
	    		System.out.println(i);
	    		for(k=0; k<=primes.size(); k++) {
		    		if(i%primes.get(k)==0) {
		    			counter = counter + 1;
			    	}
		    	}
		    	if (counter==0) {
		    		primes.add(i);
		    		System.out.println(i);
		 			}
		    } else {
		    	for(k=i/2; k>=Math.sqrt(i); k--) {
		    		if(i%k==0) {
		    			counter = counter + 1;
			    	}
		    	}
		    	if (counter==0) {
		    		primes.add(i);
		    		System.out.println(i);
		 			}
		    }
		}
		System.out.println("There are "+ primes.size() +" prime numbers");
		final long endTime = System.currentTimeMillis();
		System.out.println("Time to execute: " + (endTime - startTime) + " milliseconds");
	 }
}