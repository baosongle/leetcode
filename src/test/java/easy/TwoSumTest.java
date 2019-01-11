package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private TwoSum twoSum = new TwoSum();

    @Test
    public void test0() {
        int[] sums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(sums, target);

        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);
    }

    @Test
    public void test1() {
        int[] sums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum.twoSum(sums, target);

        Assertions.assertEquals(result[0], 1);
        Assertions.assertEquals(result[1], 2);
    }

    @Test
    public void test2() {
        int[] sums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum.twoSum(sums, target);

        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 3);
    }

    @Test
    public void test3() {
        int[] sums = {2, 7, 11, 15, 6, 8};
        int target = 21;
        int[] result = twoSum.twoSum(sums, target);

        Assertions.assertEquals(result[0], 3);
        Assertions.assertEquals(result[1], 4);
    }
}
