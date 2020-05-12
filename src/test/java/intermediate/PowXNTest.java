package intermediate;


import org.junit.Assert;
import org.junit.Test;

public class PowXNTest {
	PowXN solution = new PowXN();

	@Test
	public void test0() {
		Assert.assertEquals(1D, solution.myPow(1D, 10));
	}

	@Test
	public void test1() {
		Assert.assertEquals(1D, solution.myPow(10D, 0));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1024D, solution.myPow(2D, 10));
	}

	@Test
	public void test3() {
		Assert.assertEquals(512D, solution.myPow(2D, 9));
	}

	@Test
	public void test4() {
		Assert.assertEquals(1D / 512, solution.myPow(2D, -9));
	}

	@Test
	public void test5() {
		Assert.assertEquals(Math.pow(2D, -2147483648), solution.myPow(2D, -2147483648));
	}

	@Test
	public void test6() {
		Assert.assertEquals(Math.pow(0.00001, 2147483647), solution.myPow(0.00001, 2147483647));
	}
}
