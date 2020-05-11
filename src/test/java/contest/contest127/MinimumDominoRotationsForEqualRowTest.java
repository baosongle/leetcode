package contest.contest127;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDominoRotationsForEqualRowTest {
	private MinimumDominoRotationsForEqualRow solution = new MinimumDominoRotationsForEqualRow();

	@Test
	public void test0() {
		int[] A = {2,1,2,4,2,2};
		int[] B = {5,2,6,2,3,2};
		Assert.assertEquals(2, solution.minDominoRotations(A, B));
	}

	@Test
	public void test1() {
		int[] A = {3,5,1,2,3};
		int[] B = {3,6,3,3,4};
		Assert.assertEquals(-1, solution.minDominoRotations(A, B));
	}

	@Test
	public void test2() {
		int[] A = {4, 2, 4, 4};
		int[] B = {2, 2, 2, 2};
		Assert.assertEquals(0, solution.minDominoRotations(A, B));
	}

	@Test
	public void test3() {
		int[] A = {4, 2, 4, 4};
		int[] B = {2, 4, 2, 2};
		Assert.assertEquals(1, solution.minDominoRotations(A, B));
	}

	@Test
	public void test4() {
		int[] A = {1,2,1,1,1,2,2,2};
		int[] B = {2,1,2,2,2,2,2,2};
		Assert.assertEquals(1, solution.minDominoRotations(A, B));
	}
}
