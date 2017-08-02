package battleship;

import java.util.ArrayList;

public class Grid {
	protected int dimension;
	ArrayList<Ship> navy;
		public Grid(int dimension, ArrayList<Ship> navy) {
			this.dimension = dimension;
			this.navy = navy;
		}
		public int getDimension() {
			return dimension;
		}
		public void setDimension(int dimension) {
			this.dimension = dimension;
		}
		public ArrayList<Ship> getNavy() {
			return navy;
		}
		public void setNavy(ArrayList<Ship> navy) {
			this.navy = navy;
		}
}
