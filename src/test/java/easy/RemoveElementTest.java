package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    private RemoveElement removeElement = new RemoveElement();

    @Test
    public void test() {
        int[] nums = {3,2,2,3};
        Assert.assertEquals(2, removeElement.removeElement(nums, 3));
    }

    @Test
    public void test1() {
        int[] nums = {0,1,2,2,3,0,4,2};
        Assert.assertEquals(5, removeElement.removeElement(nums, 2));
    }

    @Test
    public void test2() {
        int[] nums = {0,0,0,0,0};
        Assert.assertEquals(0, removeElement.removeElement(nums, 0));
    }

    @Test
    public void test3() {
        int[] nums = {0};
        Assert.assertEquals(0, removeElement.removeElement(nums, 0));
    }

    @Test
    public void test4() {
        int[] nums = {0,1};
        Assert.assertEquals(1, removeElement.removeElement(nums, 0));
    }

    @Test
    public void test5() {
        int[] nums = {1,0};
        Assert.assertEquals(1, removeElement.removeElement(nums, 0));
    }

    @Test
    public void test6() {
        int[] nums = {};
        Assert.assertEquals(0, removeElement.removeElement(nums, 0));
    }
}
