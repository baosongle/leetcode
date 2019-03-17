package contest.contest128;

import java.util.HashSet;
import java.util.Set;

// 没能完成
public class NumbersWith1RepeatedDigit {
	public int numDupDigitsAtMostN(int N) {
		int digits = digits(N);
		int count = numbersWithRepeatAtN(digits - 1);
		int min = (int)  Math.pow(10, digits - 1);
		for (; min <= N; min++) {
			if (isRepeat(min))
				count++;
		}
		return count;
	}

	private int digits(int n) {
		return String.valueOf(n).length();
	}

	private int numbersWithRepeatAtN(int n) {
		if (n == 0 || n == 1)
			return 0;
		return (int) Math.pow(10, n) - 1 - noRepeatCount(n);
	}

	private int noRepeatCount(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			count *= (10 - i);
		}
		return count;
	}

	private boolean isRepeat(int n) {
		String s = String.valueOf(n);
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (!set.add(c))
				return true;
		}
		return false;
	}
}
