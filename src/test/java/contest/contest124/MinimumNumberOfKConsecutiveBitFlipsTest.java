package contest.contest124;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfKConsecutiveBitFlipsTest {
	private MinimumNumberOfKConsecutiveBitFlips solution = new MinimumNumberOfKConsecutiveBitFlips();

	@Test
	public void test() {
		int[] A = {0, 1, 0};
		Assert.assertEquals(2, solution.minKBitFlips(A, 1));
	}

	@Test
	public void test1() {
		int[] A = {1, 1, 0};
		Assert.assertEquals(-1, solution.minKBitFlips(A, 2));
	}

	@Test
	public void test2() {
		int[] A = {0,0,0,1,0,1,1,0};
		Assert.assertEquals(3, solution.minKBitFlips(A, 3));
	}

	@Test
	public void test3() {
		int[] A = {0,0,0,1,0,1,1,0};
		Assert.assertEquals(-1, solution.minKBitFlips(A, 8));
	}
}
