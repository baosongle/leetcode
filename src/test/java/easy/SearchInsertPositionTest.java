package easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {
    private SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    public void test0() {
        int[] nums = {1, 2, 5, 7};
        Assert.assertEquals(2, solution.searchInsert(nums, 5));
    }

    @Test
    public void test1() {
        int[] nums = {1, 2, 5, 7};
        Assert.assertEquals(2, solution.searchInsert(nums, 3));
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 5, 7};
        Assert.assertEquals(0, solution.searchInsert(nums, 0));
    }

    @Test
    public void test3() {
        int[] nums = {1, 2, 5, 7};
        Assert.assertEquals(4, solution.searchInsert(nums, 8));
    }

    @Test
    public void test4() {
        int[] nums = {1, 3, 5, 7};
        Assert.assertEquals(1, solution.searchInsert(nums, 3));
    }
}
