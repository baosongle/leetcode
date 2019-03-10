package contest.contest127;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximizeSumOfArrayAfterKNegationsTest {
	private MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();

	@Test
	public void test0() {
		int[] A = {4, 2, 3};
		Assertions.assertEquals(5, solution.largestSumAfterKNegations(A, 1));
	}

	@Test
	public void test1() {
		int[] A = {3, -1, 0, 2};
		Assertions.assertEquals(6, solution.largestSumAfterKNegations(A, 3));
	}

	@Test
	public void test2() {
		int[] A = {2, -3, -1, 5, -4};
		Assertions.assertEquals(13, solution.largestSumAfterKNegations(A, 2));
	}
}
