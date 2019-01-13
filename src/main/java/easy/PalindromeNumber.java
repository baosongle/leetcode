package easy;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x == 0)
			return true;

		String s = String.valueOf(x);
		while (s.length() > 1) {
			char tail = s.charAt(s.length() - 1);
			char head = s.charAt(0);
			if (tail != head)
				return false;
			s = s.substring(1, s.length() - 1);
		}
		return true;
	}
}
