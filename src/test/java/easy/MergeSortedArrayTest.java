package easy;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {
	private final MergeSortedArray solution = new MergeSortedArray();

	@Test
	public void test0() {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		int m = 3, n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = {1, 2, 2, 3, 5, 6};
		Assert.assertArrayEquals(expected, nums1);
	}

	@Test
	public void test1() {
		int[] nums1 = {1, 2, 3, 0};
		int[] nums2 = {5};
		int m = 3, n = 1;
		solution.merge(nums1, m, nums2, n);
		int[] expected = {1, 2, 3, 5};
		Assert.assertArrayEquals(expected, nums1);
	}

	@Test
	public void test2() {
		int[] nums1 = {3, 0, 0, 0};
		int[] nums2 = {1, 2, 6};
		int m = 1, n = 3;
		solution.merge(nums1, m, nums2, n);
		int[] expected = {1, 2, 3, 6};
		Assert.assertArrayEquals(expected, nums1);
	}
}
