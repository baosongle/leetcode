package contest.contest125;

import java.util.ArrayList;
import java.util.List;

public class GridIllumination {
	public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			answer[i] = doQuery(N, lamps, queries[i]);
		}
		return answer;
	}

	private int doQuery(int N, int[][] lamps, int[] query) {
		int x = query[0];
		int y = query[1];

		int[][] lightUp = lightUp(N, lamps);
		int result = lightUp[y][x];
		shutLamp(N, x, y, lamps);
		return result;
	}

	private int[][] lightUp(int N, int[][] lamps) {
		int[][] board = new int[N][N];
		for (int[] lamp : lamps) {
			int x = lamp[0];
			int y = lamp[1];
			if (x == -1 || y == -1)
				continue;
			lightRowColAndCross(board, x, y);
		}
		return board;
	}

	private void lightRowColAndCross(int[][] board, int x, int y) {
		// 点亮横竖排
		for (int i = 0; i < board.length; i++) {
			board[y][i] = 1;
			board[i][x] = 1;
		}
		int N = board.length;
		for (int i = x, j = y; i < N && j < N; i++, j++) {
			board[j][i] = 1;
		}
		for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
			board[j][i] = 1;
		}
		for (int i = x, j = y; i >= 0 && j < N; i--, j++) {
			board[j][i] = 1;
		}
		for (int i = x, j = y; i < N && j >= 0; i++, j--) {
			board[j][i] = 1;
		}
	}

	private void shutLamp(int N, int x, int y, int[][] lamps) {
		int[] l = findTheLampToShut(N, x, y, lamps);
		for (int i : l) {
			lamps[i][0] = -1;
			lamps[i][1] = -1;
		}
	}

	private int[] findTheLampToShut(int N, int x, int y, int[][] lamps) {
		List<Integer> list = new ArrayList<>();
		int i0 = isLamp(N, x, y, lamps);
		if (i0 != -1)
            list.add(i0);
		i0 = isLamp(N, x - 1, y - 1, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x - 1, y, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x - 1, y + 1, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x, y - 1, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x, y + 1, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x + 1, y - 1, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x + 1, y, lamps);
		if (i0 != -1)
			list.add(i0);
		i0 = isLamp(N, x + 1, y + 1, lamps);
		if (i0 != -1)
			list.add(i0);
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++)
        	result[i] = list.get(i);
		return result;
	}

	private int isLamp(int N, int x, int y, int[][] lamps) {
		if (x < 0 || y < 0 || x >= N || y >= N)
			return -1;
		for (int i = 0; i < lamps.length; i++) {
			int[] lamp = lamps[i];
			if (lamp[0] == x && lamp[1] == y)
				return i;
		}
		return -1;
	}
}
