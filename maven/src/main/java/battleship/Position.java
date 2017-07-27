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
	
	public int[][] positionShip(Ship S, int[][] grid) {
		int[][] shipCoordinates = new int[S.length][2];
		System.out.println("Enter x coordinate for bow");
		Scanner scan = new Scanner(System.in);
		int xBow = scan.nextInt();
		System.out.println("Enter y coordinate for bow");
		int yBow = scan.nextInt();
		System.out.println("Facing N, E, S, W?");
		String faces = scan.next();
		if (faces.equals("N")) {
			shipCoordinates = {{xBow, yBow},{xBow,yBow + 1}};
		} else if (faces.equals("E")) {
			
		} else if (faces.equals("S")) {
			
		} else if (faces.equals("W")) {
			
		} else {
			
		}
		
		return shipCoordinates;
	}
}
