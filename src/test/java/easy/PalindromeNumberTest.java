package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
	PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	public void test1() {
		Assertions.assertFalse(palindromeNumber.isPalindrome(-121));

		Assertions.assertTrue(palindromeNumber.isPalindrome(0));
		Assertions.assertTrue(palindromeNumber.isPalindrome(1));
		Assertions.assertTrue(palindromeNumber.isPalindrome(8));

		Assertions.assertTrue(palindromeNumber.isPalindrome(11));
		Assertions.assertTrue(palindromeNumber.isPalindrome(22));
		Assertions.assertTrue(palindromeNumber.isPalindrome(88));

		Assertions.assertFalse(palindromeNumber.isPalindrome(10));
		Assertions.assertFalse(palindromeNumber.isPalindrome(23));

		Assertions.assertTrue(palindromeNumber.isPalindrome(121));
		Assertions.assertTrue(palindromeNumber.isPalindrome(1221));
		Assertions.assertTrue(palindromeNumber.isPalindrome(12121));

		Assertions.assertFalse(palindromeNumber.isPalindrome(121212));
		Assertions.assertFalse(palindromeNumber.isPalindrome(121211));

		Assertions.assertFalse(palindromeNumber.isPalindrome(1000021));
	}
}
