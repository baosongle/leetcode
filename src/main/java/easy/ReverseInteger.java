package easy;

// https://leetcode-cn.com/problems/reverse-integer/
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        do {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10)
                return 0;
            result = result * 10 + x % 10;
        } while ((x /= 10) != 0);

        return result;
    }
}
