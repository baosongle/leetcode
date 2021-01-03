package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class ZigzagConversionTest {
    private final ZigzagConversion solution = new ZigzagConversion();

    @Test
    public void test0() {
        Assert.assertEquals("LCIRETOESIIGEDHN", solution.convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void test1() {
        Assert.assertEquals("LDREOEIIECIHNTSG", solution.convert("LEETCODEISHIRING", 4));
    }

    @Test
    public void test2() {
        Assert.assertEquals("a", solution.convert("a", 1));
    }

    @Test
    public void test3() {
        Assert.assertEquals("a", solution.convert("a", 2));
    }

    @Test
    public void test4() {
        Assert.assertEquals("a", solution.convert("a", 3));
    }

    @Test
    public void test5() {
        Assert.assertEquals("ab", solution.convert("ab", 2));
    }

    @Test
    public void test6() {
        Assert.assertEquals("ab", solution.convert("ab", 1));
    }
}
