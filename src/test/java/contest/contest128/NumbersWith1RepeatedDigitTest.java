package contest.contest128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersWith1RepeatedDigitTest {
	private NumbersWith1RepeatedDigit solution = new NumbersWith1RepeatedDigit();

	@Test
	public void test0() {
		Assertions.assertEquals(1, solution.numDupDigitsAtMostN(20));
	}

	@Test
	public void test1() {
		Assertions.assertEquals(10, solution.numDupDigitsAtMostN(100));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(262, solution.numDupDigitsAtMostN(1000));
	}
}
