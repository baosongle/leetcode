package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void test0() {
        Assertions.assertEquals(0, reverseInteger.reverse(0));
        Assertions.assertEquals(1, reverseInteger.reverse(1));
        Assertions.assertEquals(9, reverseInteger.reverse(9));
        Assertions.assertEquals(1, reverseInteger.reverse(10));
        Assertions.assertEquals(99, reverseInteger.reverse(99));
        Assertions.assertEquals(49, reverseInteger.reverse(94));
        Assertions.assertEquals(501, reverseInteger.reverse(105));
        Assertions.assertEquals(345, reverseInteger.reverse(543));
        Assertions.assertEquals(0, reverseInteger.reverse(1999999999));

        Assertions.assertEquals(-1, reverseInteger.reverse(-1));
        Assertions.assertEquals(-1, reverseInteger.reverse(-10));
        Assertions.assertEquals(-854, reverseInteger.reverse(-458));
        Assertions.assertEquals(0, reverseInteger.reverse(-1999999999));
        Assertions.assertEquals(0, reverseInteger.reverse(-2147483648));
    }
}
