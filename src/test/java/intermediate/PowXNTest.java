package intermediate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowXNTest {
	PowXN solution = new PowXN();

	@Test
	public void test0() {
		Assertions.assertEquals(1D, solution.myPow(1D, 10));
	}

	@Test
	public void test1() {
		Assertions.assertEquals(1D, solution.myPow(10D, 0));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(1024D, solution.myPow(2D, 10));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(512D, solution.myPow(2D, 9));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(1D / 512, solution.myPow(2D, -9));
	}

	@Test
	public void test5() {
		Assertions.assertEquals(Math.pow(2D, -2147483648), solution.myPow(2D, -2147483648));
	}

	@Test
	public void test6() {
		Assertions.assertEquals(Math.pow(0.00001, 2147483647), solution.myPow(0.00001, 2147483647));
	}
}
