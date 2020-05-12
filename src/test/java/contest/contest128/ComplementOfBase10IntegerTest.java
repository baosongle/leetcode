package contest.contest128;

import org.junit.Assert;
import org.junit.Test;

public class ComplementOfBase10IntegerTest {
	private ComplementOfBase10Integer solution = new ComplementOfBase10Integer();

	@Test
	public void test0() {
		Assert.assertEquals(2, solution.bitwiseComplement(5));
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, solution.bitwiseComplement(7));
	}

	@Test
	public void test2() {
		Assert.assertEquals(5, solution.bitwiseComplement(10));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, solution.bitwiseComplement(0));
	}
}
