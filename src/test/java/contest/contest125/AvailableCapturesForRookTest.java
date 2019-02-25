package contest.contest125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvailableCapturesForRookTest {
	private AvailableCapturesForRook solution = new AvailableCapturesForRook();

	@Test
	public void test0() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assertions.assertEquals(3, solution.numRookCaptures(board));
	}

	@Test
	public void test1() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assertions.assertEquals(0, solution.numRookCaptures(board));
	}

	@Test
	public void test2() {
		char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		Assertions.assertEquals(3, solution.numRookCaptures(board));
	}
}
