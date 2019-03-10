package contest.contest127;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClumsyFactorialTest {
	private ClumsyFactorial solution = new ClumsyFactorial();

	@Test
	public void test0() {
		Assertions.assertEquals(7, solution.clumsy(4));
	}

	@Test
	public void test1() {
		Assertions.assertEquals(12, solution.clumsy(10));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(6, solution.clumsy(3));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(2, solution.clumsy(2));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(1, solution.clumsy(1));
	}

	@Test
	public void test5() {
		Assertions.assertEquals(10, solution.clumsy(11));
	}
}
