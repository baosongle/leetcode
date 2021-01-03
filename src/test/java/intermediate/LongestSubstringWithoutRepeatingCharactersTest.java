package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private final LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test0() {
        Assert.assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    public void test1() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(4, solution.lengthOfLongestSubstring("abcd"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(4, solution.lengthOfLongestSubstring("abcdcd"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(7, solution.lengthOfLongestSubstring("abcdcefghi"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(2, solution.lengthOfLongestSubstring("abaaaaa"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}
