package intermediate;

import java.util.*;

// https://leetcode-cn.com/problems/3sum/submissions/
public class ThreeSum {
    public List<List<Integer>> threeSum(int... nums) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                int target = -(nums[i] + nums[j]);
                if (target >= 0) {
                    for (int k = nums.length - 1; k > j; k--) {
                        int c = nums[k];
                        if (c == target) {
                            addResult(result, a, b, c);
                            break;
                        } else if (c < target) {
                            break;
                        }
                    }
                } else {
                    for (int k = j + 1; k < nums.length; k++) {
                        int c = nums[k];
                        if (c == target) {
                            addResult(result, a, b, c);
                            break;
                        } else if (c > target) {
                            break;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    private void addResult(Set<List<Integer>> result, int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        result.add(Arrays.asList(array[0], array[1], array[2]));
    }
}
