package contest.contest127;

import org.junit.Assert;
import org.junit.Test;

public class ClumsyFactorialTest {
	private ClumsyFactorial solution = new ClumsyFactorial();

	@Test
	public void test0() {
		Assert.assertEquals(7, solution.clumsy(4));
	}

	@Test
	public void test1() {
		Assert.assertEquals(12, solution.clumsy(10));
	}

	@Test
	public void test2() {
		Assert.assertEquals(6, solution.clumsy(3));
	}

	@Test
	public void test3() {
		Assert.assertEquals(2, solution.clumsy(2));
	}

	@Test
	public void test4() {
		Assert.assertEquals(1, solution.clumsy(1));
	}

	@Test
	public void test5() {
		Assert.assertEquals(10, solution.clumsy(11));
	}
}
