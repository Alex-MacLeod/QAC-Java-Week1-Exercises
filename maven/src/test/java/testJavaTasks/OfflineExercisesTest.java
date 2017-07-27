package testJavaTasks;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import offlineExercises.DoubleChar;
import offlineExercises.EvenlySpaced;
import offlineExercises.GetSandwich;
import offlineExercises.NTwice;

public class OfflineExercisesTest {

	@Ignore
	public void testDoubleChar() {
		DoubleChar d = new DoubleChar();
		String testInput = "Elliott";
		d.doubleChar(testInput);
		assertEquals("EElllliioott", d.doubleChar(testInput));
	}

	@Test
	public void testGetSandwich() {
		GetSandwich g = new GetSandwich();
		String testFilling = "filling";
		String testSandwich = "bread" + testFilling.concat("bread");
		assertEquals(testFilling, g.getSandwich(testSandwich));
	}
	
	@Ignore
	public void testEvenlySpaced() {
		//EvenlySpaced e = new EvenlySpaced();
		//int x = 2, y = 6, z = 4;
		//assertTrue(e.evenlySpaced(x, y, z));
	}
	
	@Test
	public void testNTwice() {
		NTwice t = new NTwice();
		String testInput = "hamburger";
		int testNum = 3;
		assertEquals("hamger", t.nTwice(testInput, testNum));
	}
}
