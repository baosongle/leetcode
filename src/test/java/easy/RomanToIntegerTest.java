package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
	private RomanToInteger romanToInteger = new RomanToInteger();

	@Test
	public void test() {
		Assert.assertEquals(3, romanToInteger.romanToInt("III"));
		Assert.assertEquals(4, romanToInteger.romanToInt("IV"));
		Assert.assertEquals(9, romanToInteger.romanToInt("IX"));
		Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
		Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
	}
}
