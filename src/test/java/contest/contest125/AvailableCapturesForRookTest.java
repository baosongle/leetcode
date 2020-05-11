package contest.contest125;

import org.junit.Assert;
import org.junit.Test;

public class AvailableCapturesForRookTest {
	private AvailableCapturesForRook solution = new AvailableCapturesForRook();

	@Test
	public void test0() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assert.assertEquals(3, solution.numRookCaptures(board));
	}

	@Test
	public void test1() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assert.assertEquals(0, solution.numRookCaptures(board));
	}

	@Test
	public void test2() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assert.assertEquals(3, solution.numRookCaptures(board));
	}
}
