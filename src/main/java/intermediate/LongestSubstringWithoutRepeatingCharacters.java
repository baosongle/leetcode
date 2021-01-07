package intermediate;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        final int EMPTY = -1;
        int[] array = new int[128];
        Arrays.fill(array, EMPTY);
        int max = 1;
        int i = 0, j = 1;
        while (i < s.length() && j < s.length()) {
            array[s.charAt(i)] = i;
            if (array[s.charAt(j)] == EMPTY) {
                int length = j - i + 1;
                if (length > max) {
                    max = length;
                }
            } else {
                int length = j - i;
                if (length > max) {
                    max = length;
                }
                int duplicateI = array[s.charAt(j)];
                for (int m = i; m < duplicateI; m++) {
                    array[s.charAt(m)] = EMPTY;
                }
                i = duplicateI + 1;
            }
            array[s.charAt(j)] = j;
            j++;
        }
        return max;
    }
}
