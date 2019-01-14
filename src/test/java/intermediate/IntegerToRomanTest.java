package intermediate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
	private IntegerToRoman integerToRoman = new IntegerToRoman();

	@Test
	public void test() {
		Assertions.assertEquals("III", integerToRoman.intToRoman(3));
		Assertions.assertEquals("IV", integerToRoman.intToRoman(4));
		Assertions.assertEquals("IX", integerToRoman.intToRoman(9));
		Assertions.assertEquals("LVIII", integerToRoman.intToRoman(58));
		Assertions.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
	}
}
