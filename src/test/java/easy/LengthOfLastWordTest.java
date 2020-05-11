package easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {
    private LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    public void test0() {
        Assert.assertEquals(5, solution.lengthOfLastWord("hello world"));
    }

    @Test
    public void test1() {
        Assert.assertEquals(0, solution.lengthOfLastWord(""));
    }

    @Test
    public void test2() {
        Assert.assertEquals(5, solution.lengthOfLastWord("hello"));
    }
}
