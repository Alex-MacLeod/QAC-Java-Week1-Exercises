package objects;
import java.util.Arrays;

public class PrimeNumbers {
	
	public int generatePrimes(int limit) {	//not originally my code. Based off algorithm called "Sieve of Atkin"
											//Also, for some reason, it doesn't give accurate number of primes for 1 billion and above.
		
		int sqrtLimit = (int) Math.sqrt(limit);
		boolean[] sieve = new boolean[limit + 1];
		Arrays.fill(sieve, false);
		sieve[0] = false;
	    sieve[1] = false;
	    sieve[2] = true;
	    sieve[3] = true;

		for (int x=1; x<=sqrtLimit; x++) {
			for (int y = 1; y <= sqrtLimit; y++) {
	            // first quadratic using m = 12 and r in R1 = {r : 1, 5}
	            int n = (4 * x * x) + (y * y);
	            if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
	                sieve[n] = !sieve[n];
	            	}
	            // second quadratic using m = 12 and r in R2 = {r : 7}
	            n = (3 * x * x) + (y * y);
	            if (n <= limit && (n % 12 == 7)) {
	                sieve[n] = !sieve[n];
	            	}
	            // third quadratic using m = 12 and r in R3 = {r : 11}
	            n = (3 * x * x) - (y * y);
	            if (x > y && n <= limit && (n % 12 == 11)) {
	                sieve[n] = !sieve[n];
	            	}
			}
		}
		for (int n = 5; n <= sqrtLimit; n++) {
	        if (sieve[n]) {
	            int x = n * n;
	            for (int i = x; i <= limit; i += x) {
	                sieve[i] = false;
	            }
	        }
	    }
		int count = 0;
		for (int i = 0; i <= limit; i++) {
	        if (sieve[i]) {
	        	count = count + 1;
	        	}
			}
		return count;
		
	}
}