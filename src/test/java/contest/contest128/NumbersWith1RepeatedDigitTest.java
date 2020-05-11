package contest.contest128;

import org.junit.Assert;
import org.junit.Test;

public class NumbersWith1RepeatedDigitTest {
	private NumbersWith1RepeatedDigit solution = new NumbersWith1RepeatedDigit();

	@Test
	public void test0() {
		Assert.assertEquals(1, solution.numDupDigitsAtMostN(20));
	}

	@Test
	public void test1() {
		Assert.assertEquals(10, solution.numDupDigitsAtMostN(100));
	}

	@Test
	public void test2() {
		Assert.assertEquals(262, solution.numDupDigitsAtMostN(1000));
	}
}
