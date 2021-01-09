package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    private final PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution =
            new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void test0() {
        Assert.assertEquals(0, solution.minPartitions("0"));
    }

    @Test
    public void test1() {
        Assert.assertEquals(1, solution.minPartitions("1"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, solution.minPartitions("10"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, solution.minPartitions("11"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(3, solution.minPartitions("32"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, solution.minPartitions("33"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(9, solution.minPartitions("9"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(2, solution.minPartitions("12"));
    }

    @Test
    public void test8() {
        Assert.assertEquals(3, solution.minPartitions("13"));
    }

    @Test
    public void test9() {
        Assert.assertEquals(8, solution.minPartitions("82734"));
    }

    @Test
    public void test10() {
        Assert.assertEquals(9, solution.minPartitions("27346209830709182346"));
    }
}
