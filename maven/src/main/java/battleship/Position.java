package battleship;

import java.util.ArrayList;
import java.util.Scanner;

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
		Scanner scan = new Scanner(System.in);
		int xBow = scan.nextInt();
		System.out.println("Enter y coordinate for bow");
		int yBow = scan.nextInt();
		System.out.println("Facing N, E, S, W?");
		String faces = scan.next();
		int xStern = 0, yStern = 0;
		if (faces.equals("N")) {
			xStern = xBow;
			yStern = yBow +1;
		} else if (faces.equals("E")) {
			xStern = xBow -1;
			yStern = yBow;
		} else if (faces.equals("S")) {
			xStern = xBow;
			yStern = yBow -1;
		} else if (faces.equals("W")) {
			xStern = xBow +1;
			yStern = yBow;
		} else {
			System.out.println("Did not recognise input");
		}
		setCoordinates(shipCoordinates, xBow, yBow, xStern, yStern);
		return shipCoordinates;
	}
}
