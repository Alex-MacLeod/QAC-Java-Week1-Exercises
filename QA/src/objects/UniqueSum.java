
package objects;

public class UniqueSum {
	
	public int uniqueSum(int A, int B, int C){
				if (A==B&&B==C) {
					return 0;
				} else if (A==B) {
					return C;
				} else if (B==C) {
					return A;
				} else if (A==C) {
					return B;
				} else {
					return A+B+C;
				}
	}
}
