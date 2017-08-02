package objects;

import java.util.Scanner;

public class CountPrimes {
	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);           
			System.out.println ("Enter upper limit: "); 
			String a = scan.nextLine();
			int limit = Integer.parseInt(a);
			
			int min;
			System.out.println ("Specify lower limit?");
			String b = scan.nextLine();
				if ("YES".equals(b)) {
					System.out.println ("Enter lower limit: ");
					String c = scan.nextLine();
					min = Integer.parseInt(c);
				} else {
					min = 0;
				}
			
			long startTime = System.currentTimeMillis();
			
			int countMax = p.generatePrimes(limit);
			
			int countMin;
			if (min >= 3) {
				countMin = p.generatePrimes(min);
			} else if (min == 2) {
				countMin = 1;
			} else {
				countMin = 0;
			}
			
			int totalCount = countMax - countMin;
			
			final long endTime = System.currentTimeMillis();
			
			System.out.println("Between "+ limit + " and " + min + ", there are " + totalCount + " prime numbers");
			
			System.out.println("Time to execute: " + ((double)(endTime - startTime)/1000) + " seconds");
	}
}
