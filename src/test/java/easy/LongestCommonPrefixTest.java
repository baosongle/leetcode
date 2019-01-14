package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
	private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

	@Test
	public void test() {
		Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix("flower","flow","flight"));
		Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix("dog","racecar","car"));
		Assertions.assertEquals("d", longestCommonPrefix.longestCommonPrefix("dog","dacecar","dar"));
	}
}
