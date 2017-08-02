package battleship;

import java.util.ArrayList;

public class Position {
	
	public int[][] buildGrid(int dimension, ArrayList<Ship> navy) {
		Grid g = new Grid(dimension, navy);
		g.setDimension(dimension);
		int[][] grid = new int[g.dimension][g.dimension];
		return grid;
	}
	
	public void addShip(ArrayList<Ship> navy, Ship S) {
		navy.add(S);
	}
	
	public int[][] setCoordinates(int[][] shipCoordinates, int xBow, int yBow, int xStern, int yStern) {
		
		return shipCoordinates;
	}
	
	public int[][] positionShip(Ship S) {
		int[][] shipCoordinates = new int[S.length][2];
		System.out.println("Enter x coordinate for bow");
		int xBow = Input.scan.nextInt();
		System.out.println("Enter y coordinate for bow");
		int yBow = Input.scan.nextInt();
		System.out.println("Facing N, E, S, W?");
		String faces = Input.scan.next();
		int xStern = 0;
		int yStern = 0;
		if ("N".equals(faces)) {
			xStern = xBow;
			yStern = yBow +1;
		} else if ("E".equals(faces)) {
			xStern = xBow -1;
			yStern = yBow;
		} else if ("S".equals(faces)) {
			xStern = xBow;
			yStern = yBow -1;
		} else if ("W".equals(faces)) {
			xStern = xBow +1;
			yStern = yBow;
		} else {
			System.out.println("Did not recognise input");
		}
		setCoordinates(shipCoordinates, xBow, yBow, xStern, yStern);
		return shipCoordinates;
	}
}
