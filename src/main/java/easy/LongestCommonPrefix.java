package easy;

// https://leetcode-cn.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
	public String longestCommonPrefix(String ... strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];

		boolean stop = false;
		int i = 0;
		while (true) {
			if (i >= strs[0].length()) {
				break;
			}
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				String str = strs[j];
				if (i >= str.length()) {
					stop = true;
					break;
				}
				char c1 = str.charAt(i);
				if (c1 != c) {
					stop = true;
					break;
				}
			}
			if (stop)
				break;
			i++;
		}
        return strs[0].substring(0, i);
	}
}
