package easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
	private ValidParentheses validParentheses = new ValidParentheses();

	@Test
	public void test() {
		Assert.assertTrue(validParentheses.isValid("()"));
		Assert.assertTrue(validParentheses.isValid("()[]{}"));
		Assert.assertTrue(validParentheses.isValid("{[]}"));

		Assert.assertFalse(validParentheses.isValid("(]"));
		Assert.assertFalse(validParentheses.isValid(")]"));
		Assert.assertFalse(validParentheses.isValid("("));
		Assert.assertFalse(validParentheses.isValid("([)]"));
	}
}
