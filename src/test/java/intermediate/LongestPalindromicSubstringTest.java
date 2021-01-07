package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    public void test0() {
        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
    }

    @Test
    public void test1() {
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("a", solution.longestPalindrome("abcd"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("aa", solution.longestPalindrome("aa"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("aba", solution.longestPalindrome("aba"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("aba", solution.longestPalindrome("caba"));
    }

    @Test
    public void test6() {
        Assert.assertEquals("abccba", solution.longestPalindrome("dabccbac"));
    }

    @Test
    public void test7() {
        Assert.assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    public void test8() {
        Assert.assertEquals("a", solution.longestPalindrome("ac"));
    }

    @Test
    public void test9() {
        Assert.assertEquals("aca", solution.longestPalindrome("aacabdkacaa"));
    }
}
