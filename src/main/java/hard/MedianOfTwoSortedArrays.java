package hard;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        List<Integer> list = new ArrayList<>(total);
        int i = 0, j = 0;
        while (true) {
            int n = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int m = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;
            if (n == m && n == Integer.MAX_VALUE) {
                break;
            }
            if (n < m) {
                list.add(n);
                i++;
            } else {
                list.add(m);
                j++;
            }
        }
        int k = total / 2;
        if (total % 2 == 0) {
            return (list.get(k) + list.get(k - 1)) / 2.0;
        } else {
            return list.get(k);
        }
    }
}
