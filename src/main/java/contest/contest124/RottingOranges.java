package contest.contest124;

import java.util.ArrayList;
import java.util.List;

public class RottingOranges {
	private static final int NULL = 0;
	private static final int FRESH = 1;
	private static final int ROTTING = 2;

	public int orangesRotting(int[][] grid) {
		int time = 0;
		while (hasFresh(grid)) {
			int i = minute(grid);
			if (i == 0 && hasFresh(grid))
                return -1;
			time++;
		}
		return time;
	}

	private int minute(int[][] grid) {
		List<Mark> marks = new ArrayList<>();
		for (int x = 0; x < grid.length; x++) {
			int[] line = grid[x];
			for (int y = 0; y < line.length; y++) {
				int cell = line[y];
				if (cell == NULL || cell == ROTTING)
					continue;

				int left = getGridAt(grid, x, y - 1);
				if (left == ROTTING) {
                    marks.add(new Mark(x, y));
					continue;
				}
				int right = getGridAt(grid, x, y + 1);
				if (right == ROTTING) {
					marks.add(new Mark(x, y));
					continue;
				}
				int up = getGridAt(grid, x - 1, y);
				if (up == ROTTING) {
					marks.add(new Mark(x, y));
					continue;
				}
				int bottom = getGridAt(grid, x + 1, y);
				if (bottom == ROTTING) {
					marks.add(new Mark(x, y));
				}
			}
		}
		if (marks.isEmpty())
			return 0;
		for (Mark mark : marks)
			grid[mark.x][mark.y] = ROTTING;

		return 1;
	}

	static class Mark {
		int x, y;
		public Mark(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private int getGridAt(int[][] grid, int x, int y) {
		if (x < 0 || y < 0)
			return NULL;
		if (x >= grid.length)
			return NULL;
		if (y >= grid[0].length)
			return NULL;
		return grid[x][y];
	}

    private boolean hasFresh(int[][] grid) {
		for (int[] line : grid) {
			for (int cell : line) {
				if (cell == FRESH)
					return true;
			}
		}
		return false;
	}

	// private boolean hasGridChange(int[][] old, int[][] nEW) {
    //     for (int x = 0; x < old.length; x++) {
    //     	int[] oldLine = old[x];
	// 		int[] newLine = nEW[x];
    //     	boolean result = Arrays.equals(oldLine, newLine);
    //     	if (!result)
    //     		return false;
	// 	}
    //     return true;
	// }
}
