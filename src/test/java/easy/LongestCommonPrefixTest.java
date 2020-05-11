package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
	private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

	@Test
	public void test() {
		Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix("flower","flow","flight"));
		Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix("dog","racecar","car"));
		Assert.assertEquals("d", longestCommonPrefix.longestCommonPrefix("dog","dacecar","dar"));
	}
}
