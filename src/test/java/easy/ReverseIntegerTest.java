package easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void test0() {
        Assert.assertEquals(0, reverseInteger.reverse(0));
        Assert.assertEquals(1, reverseInteger.reverse(1));
        Assert.assertEquals(9, reverseInteger.reverse(9));
        Assert.assertEquals(1, reverseInteger.reverse(10));
        Assert.assertEquals(99, reverseInteger.reverse(99));
        Assert.assertEquals(49, reverseInteger.reverse(94));
        Assert.assertEquals(501, reverseInteger.reverse(105));
        Assert.assertEquals(345, reverseInteger.reverse(543));
        Assert.assertEquals(0, reverseInteger.reverse(1999999999));

        Assert.assertEquals(-1, reverseInteger.reverse(-1));
        Assert.assertEquals(-1, reverseInteger.reverse(-10));
        Assert.assertEquals(-854, reverseInteger.reverse(-458));
        Assert.assertEquals(0, reverseInteger.reverse(-1999999999));
        Assert.assertEquals(0, reverseInteger.reverse(-2147483648));
    }
}
