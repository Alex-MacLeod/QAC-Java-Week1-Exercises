
package objects;

public class TooHot {
		public boolean tooHot(int T, boolean S){
			if (S) {
				if (T<60|T>100) {
					return false;
				} else {
					return true;
				}
			} else {
				if (T<60|T>90) {
					return false;
				} else {
					return true;
				}
			}
	}
}
	
