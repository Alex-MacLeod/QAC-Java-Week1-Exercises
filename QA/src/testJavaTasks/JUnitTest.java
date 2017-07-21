//18 Junit

package testJavaTasks;

import static org.junit.Assert.*;

import org.junit.Test;

import objects.TooHot;
import objects.UniqueSum;
import objects.People;

public class JUnitTest {

	@Test
	public void testUniqueSum() {
		UniqueSum testUniqueSum = new UniqueSum();
		int A = 1, B = 1, C = 1;
		assertEquals("uniqueSum must give 0 if all elements are the same",0,testUniqueSum.uniqueSum(A, B, C));
	}
	@Test
	public void testTooHot() {
		TooHot testTooHot = new TooHot();
		int T = 105;
		boolean S = true;
		assertFalse(testTooHot.tooHot(T, S));
	}
	@Test
	public void testPeople() {
		People testPeople = new People("Bob", 45, "builder");
		assertEquals("My name is Bob, I'm 45 years old, and I'm a builder",testPeople.details());
	}
}
