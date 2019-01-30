package intermediate;

// https://leetcode-cn.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int... height) {
        int max = 0;
        int i = 0, j = height.length - 1;

        while (i < j) {
            int left = height[i];
            int right = height[j];
            max = Math.max(max, Math.min(left, right) * (j - i));
            if (left < right)
                i++;
            else
                j--;
        }
        return max;
    }
}
