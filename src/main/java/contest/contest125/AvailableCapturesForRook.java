package contest.contest125;

public class AvailableCapturesForRook {
	public int numRookCaptures(char[][] board) {
		int[] r = findTheRook(board);
		char up = goUp(r, board);
		char down = goDown(r, board);
		char left = goLeft(r, board);
		char right = goRight(r, board);

		int result = 0;
		if (up == 'p')
			result++;
		if (down == 'p')
			result++;
		if (left == 'p')
			result++;
		if (right == 'p')
			result++;
		return result;
	}

	private int[] findTheRook(char[][] board) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				char c = board[i][j];
				if (c == 'R') {
					int[] r = {i, j};
					return r;
				}
			}
		}
		return null;	// 不可能
	}

	private char goUp(int[] start, char[][] board) {
		int startRow = start[0];
		int col = start[1];

		for (int row = startRow - 1; row >= 0; row--) {
			char c = board[row][col];
			if (c == '.')
				continue;
			return c;
		}
		return '.';
	}

	private char goDown(int[] start, char[][] board) {
		int startRow = start[0];
		int col = start[1];

		for (int row = startRow + 1; row < 8; row++) {
			char c = board[row][col];
			if (c == '.')
				continue;
			return c;
		}
		return '.';
	}

	private char goLeft(int[] start, char[][] board) {
		int row = start[0];
		int startCol = start[1];

		for (int col = startCol - 1; col >= 0; col--) {
			char c = board[row][col];
			if (c == '.')
				continue;
			return c;
		}
		return '.';
	}

	private char goRight(int[] start, char[][] board) {
		int row = start[0];
		int startCol = start[1];

		for (int col = startCol + 1; col < 8; col++) {
			char c = board[row][col];
			if (c == '.')
				continue;
			return c;
		}
		return '.';
	}
}
