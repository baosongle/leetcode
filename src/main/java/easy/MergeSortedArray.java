package easy;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m >= 0)
			System.arraycopy(nums1, 0, nums1, n, m);
		int mi = n, ni = 0, i = 0;
		while (true) {
			int n1 = Integer.MAX_VALUE;
			int n2 = Integer.MAX_VALUE;
			if (mi < m + n) {
				n1 = nums1[mi];
			}
			if (ni < n) {
				n2 = nums2[ni];
			}
			if (n1 == Integer.MAX_VALUE && n2 == Integer.MAX_VALUE) {
				break;
			}
			if (n1 < n2) {
				nums1[i] = n1;
				mi++;
			} else {
				nums1[i] = n2;
				ni++;
			}
			i++;
		}
	}
}

