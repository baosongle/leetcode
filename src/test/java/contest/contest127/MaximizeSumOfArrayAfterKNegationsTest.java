package contest.contest127;

import org.junit.Assert;
import org.junit.Test;

public class MaximizeSumOfArrayAfterKNegationsTest {
	private MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();

	@Test
	public void test0() {
		int[] A = {4, 2, 3};
		Assert.assertEquals(5, solution.largestSumAfterKNegations(A, 1));
	}

	@Test
	public void test1() {
		int[] A = {3, -1, 0, 2};
		Assert.assertEquals(6, solution.largestSumAfterKNegations(A, 3));
	}

	@Test
	public void test2() {
		int[] A = {2, -3, -1, 5, -4};
		Assert.assertEquals(13, solution.largestSumAfterKNegations(A, 2));
	}
}
