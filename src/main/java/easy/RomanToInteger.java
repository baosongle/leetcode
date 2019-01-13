package easy;

// https://leetcode-cn.com/problems/roman-to-integer/
public class RomanToInteger {
	private static final int I = 1;
	private static final int V = 5;
	private static final int X = 10;
	private static final int L = 50;
	private static final int C = 100;
	private static final int D = 500;
	private static final int M = 1000;

	public int romanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); ) {
			char c = s.charAt(i++);
			if (i == s.length()) {
				// c 是字符串中最后一个 char 了
				result += convert(c);
				break;
			}
			char next = s.charAt(i);
			if (isSubtract(c, next)) {
				result += (convert(next) - convert(c));
				i++;
			} else {
				result += convert(c);
			}
		}
		return result;
	}

	private int convert(char c) {
		switch (c) {
			case 'I':
				return I;
			case 'V':
				return V;
			case 'X':
				return X;
			case 'L':
				return L;
			case 'C':
				return C;
			case 'D':
				return D;
			case 'M':
				return M;
			default:
				return 0;
		}
	}

	private boolean isSubtract(char c1, char c2) {
		switch (c1) {
			case 'I':
				return c2 == 'V' || c2 == 'X';
			case 'X':
				return c2 == 'L' || c2 == 'C';
			case 'C':
				return c2 == 'D' || c2 == 'M';
			default:
				return false;
		}
	}
}
