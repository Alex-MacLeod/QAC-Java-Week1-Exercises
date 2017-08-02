
package objects;

public class TooHot {
		public boolean tooHot(int T, boolean S){
			if (S) {
				return !(T<60|T>100);
			} else {
				return !(T<60|T>90);
			}
	}
}
	
