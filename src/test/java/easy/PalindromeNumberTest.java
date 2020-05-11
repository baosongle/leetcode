package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
	PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Test
	public void test1() {
		Assert.assertFalse(palindromeNumber.isPalindrome(-121));

		Assert.assertTrue(palindromeNumber.isPalindrome(0));
		Assert.assertTrue(palindromeNumber.isPalindrome(1));
		Assert.assertTrue(palindromeNumber.isPalindrome(8));

		Assert.assertTrue(palindromeNumber.isPalindrome(11));
		Assert.assertTrue(palindromeNumber.isPalindrome(22));
		Assert.assertTrue(palindromeNumber.isPalindrome(88));

		Assert.assertFalse(palindromeNumber.isPalindrome(10));
		Assert.assertFalse(palindromeNumber.isPalindrome(23));

		Assert.assertTrue(palindromeNumber.isPalindrome(121));
		Assert.assertTrue(palindromeNumber.isPalindrome(1221));
		Assert.assertTrue(palindromeNumber.isPalindrome(12121));

		Assert.assertFalse(palindromeNumber.isPalindrome(121212));
		Assert.assertFalse(palindromeNumber.isPalindrome(121211));

		Assert.assertFalse(palindromeNumber.isPalindrome(1000021));
	}
}
