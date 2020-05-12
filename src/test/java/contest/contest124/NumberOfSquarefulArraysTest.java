package contest.contest124;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSquarefulArraysTest {
	private NumberOfSquarefulArrays solution = new NumberOfSquarefulArrays();

	@Test
	public void test() {
		int[] A = {1, 17, 8};
		Assert.assertEquals(2, solution.numSquarefulPerms(A));
	}
}
