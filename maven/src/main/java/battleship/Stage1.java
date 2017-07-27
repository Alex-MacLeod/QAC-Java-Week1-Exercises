package battleship;

import java.util.ArrayList;

public class Stage1 {
	public static void main(String[] args) {
		
		Position p = new Position();
		
		ArrayList<Ship> fleet = new ArrayList<Ship>();
		
		Grid G = new Grid (3, fleet);
		Ship patrol = new Ship ("Patrol", 2);
		
		p.buildGrid(G.dimension, fleet);
		p.addShip(fleet, patrol);
		
		
	}
}
