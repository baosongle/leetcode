package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
	private RomanToInteger romanToInteger = new RomanToInteger();

	@Test
	public void test() {
		Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
		Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
		Assertions.assertEquals(9, romanToInteger.romanToInt("IX"));
		Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
		Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
	}
}
