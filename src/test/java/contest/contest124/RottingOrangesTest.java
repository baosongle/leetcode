package contest.contest124;

import org.junit.Assert;
import org.junit.Test;

public class RottingOrangesTest {
	private RottingOranges solution = new RottingOranges();

	@Test
	public void test() {
		int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
		Assert.assertEquals(4, solution.orangesRotting(grid));
	}

	@Test
	public void test1() {
		int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
		Assert.assertEquals(-1, solution.orangesRotting(grid));
	}
}
