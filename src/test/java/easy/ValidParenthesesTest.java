package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
	private ValidParentheses validParentheses = new ValidParentheses();

	@Test
	public void test() {
		Assertions.assertTrue(validParentheses.isValid("()"));
		Assertions.assertTrue(validParentheses.isValid("()[]{}"));
		Assertions.assertTrue(validParentheses.isValid("{[]}"));

		Assertions.assertFalse(validParentheses.isValid("(]"));
		Assertions.assertFalse(validParentheses.isValid(")]"));
		Assertions.assertFalse(validParentheses.isValid("("));
		Assertions.assertFalse(validParentheses.isValid("([)]"));
	}
}
