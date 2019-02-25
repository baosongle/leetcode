package contest.contest125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheJudgeTest {
	private FindTheTownJudge solution = new FindTheTownJudge();

	@Test
	public void test0() {
		int N = 2;
		int[][] trust = {{1, 2}};

		Assertions.assertEquals(2, solution.findJudge(N, trust));
	}

	@Test
	public void test1() {
		int N = 3;
		int[][] trust = {{1, 3}, {2, 3}};

		Assertions.assertEquals(3, solution.findJudge(N, trust));
	}

	@Test
	public void test2() {
		int N = 3;
		int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

		Assertions.assertEquals(-1, solution.findJudge(N, trust));
	}

	@Test
	public void test3() {
		int N = 4;
		int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

		Assertions.assertEquals(3, solution.findJudge(N, trust));
	}
}
