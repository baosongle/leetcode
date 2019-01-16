package easy;

// https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int... nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        int duplicate = 0;
        int last = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] == last) {
                remove(nums, i--);
                duplicate++;
                length--;
                continue;
            }
            last = nums[i];
        }
        return nums.length - duplicate;
    }

    private void remove(int[] nums, int index) {
        if (index == nums.length - 1)
            return;
        System.arraycopy(nums, index + 1, nums, index, nums.length - index - 1);
    }
}
