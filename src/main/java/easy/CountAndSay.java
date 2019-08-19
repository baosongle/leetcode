package easy;

public class CountAndSay {
	public String countAndSay(int n) {
		if (n == 1)
			return "1";
		if (n == 2)
			return "11";

		StringBuilder sb = new StringBuilder();
		char[] chars = (countAndSay(n - 1)).toCharArray();
		int i = 0, j = 1;
		final int max = chars.length;
		while (i < max && j < max) {
			char a = chars[i], b = chars[j];
			if (a == b) {
				j++;
			} else {
				sb.append(j - i).append(a);
				i = j;
				j++;
			}
			if (j == chars.length) {
				sb.append(j - i).append(b);
			}
		}
		return sb.toString();
	}
}
