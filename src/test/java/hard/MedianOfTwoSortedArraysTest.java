package hard;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    public void test0() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Assert.assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.001);
    }

    @Test
    public void test1() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Assert.assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.001);
    }

    @Test
    public void test2() {
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        Assert.assertEquals(0.0, solution.findMedianSortedArrays(nums1, nums2), 0.001);
    }

    @Test
    public void test3() {
        int[] nums1 = {};
        int[] nums2 = {1};
        Assert.assertEquals(1.0, solution.findMedianSortedArrays(nums1, nums2), 0.001);
    }

    @Test
    public void test4() {
        int[] nums1 = {2};
        int[] nums2 = {};
        Assert.assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.001);
    }
}
