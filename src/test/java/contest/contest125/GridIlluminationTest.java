package contest.contest125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridIlluminationTest {
	private GridIllumination solution = new GridIllumination();

	@Test
	public void test0() {
		int N = 5;
		int[][] lamps = {{0,0},{4,4}};
		int[][] queries = {{1,1},{1,0}};

		int[] answer = {1, 0};
		Assertions.assertArrayEquals(answer, solution.gridIllumination(N, lamps, queries));
	}

	@Test
	public void test1() {
		int N = 10;
		int[][] lamps = {{3,9},{3,6}, {8, 3}, {5, 3}, {8, 1}, {1, 3}, {5, 9}, {4, 2}};
		int[][] queries = {{1,9},{4,9}, {7, 1}, {6, 9}};

		int[] answer = {1, 1, 1, 1};
		Assertions.assertArrayEquals(answer, solution.gridIllumination(N, lamps, queries));
	}

	@Test
	public void test2() {
		int N = 10;
		int[][] lamps = {{0,3},{8,4}, {3, 1}, {2, 1}, {6, 1}, {5, 9}, {3, 7}, {1, 9}, {8, 8}, {0, 1}};
		int[][] queries = {{2,4},{9,9}, {6, 9}, {9, 7}, {5, 1}};

		int[] answer = {1, 1, 1, 1, 1};
		Assertions.assertArrayEquals(answer, solution.gridIllumination(N, lamps, queries));
	}
}
