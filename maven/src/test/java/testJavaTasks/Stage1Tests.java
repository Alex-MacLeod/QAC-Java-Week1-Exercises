package testJavaTasks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import battleship.Position;
import battleship.Ship;

public class Stage1Tests {

	Position test = new Position();
	
	@Test
	public void testBuildGrid() {
		ArrayList<Ship> testFleet = new ArrayList<Ship>();
		int testDim = 3;
		int[][] testGrid = new int[testDim][testDim];
		
		for (int i=0; i<testDim; i++) {
			for (int j=0; j<testDim; j++) {
				assertEquals(test.buildGrid(testDim, testFleet)[i][j], testGrid[i][j]);
			}
		}
		assertEquals(test.buildGrid(testDim, testFleet)[1][1], testGrid[1][1]);
	}
	
	@Test
	public void testAddShip() {
		ArrayList<Ship> testFleet = new ArrayList<Ship>();
		Ship testShip = new Ship("S", 2);
		
		test.addShip(testFleet, testShip);
		assertEquals(testShip.getType(), testFleet.get(0).getType());
	}
	
	@Test
	public void testPositionShip() {
		
		
	}
}
