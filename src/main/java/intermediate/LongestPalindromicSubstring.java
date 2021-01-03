package intermediate;

// O(n^2)
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int max = 1;
        String r = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (j - i < max) {
                    break;
                }
                if (isPalindromic(s, i, j)) {
                    int length = j - i + 1;
                    if (length > max) {
                        max = length;
                        r = s.substring(i, j + 1);
                        break;
                    }
                }
            }
        }
        return r;
    }

    private boolean isPalindromic(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
