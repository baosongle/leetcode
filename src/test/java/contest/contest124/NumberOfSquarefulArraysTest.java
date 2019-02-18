package contest.contest124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSquarefulArraysTest {
	private NumberOfSquarefulArrays solution = new NumberOfSquarefulArrays();

	@Test
	public void test() {
		int[] A = {1, 17, 8};
		Assertions.assertEquals(2, solution.numSquarefulPerms(A));
	}
}
