package intermediate;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GenerateParenthesesTest {
	private GenerateParentheses solution = new GenerateParentheses();

	@Test
	public void test1() {
		Set<String> expected = new HashSet<>(Collections.singleton("()"));
		Assert.assertEquals(expected, new HashSet<>(solution.generateParenthesis(1)));
	}

	@Test
	public void test2() {
		Set<String> expected = new HashSet<>(Arrays.asList("()()", "(())"));
		Assert.assertEquals(expected, new HashSet<>(solution.generateParenthesis(2)));
	}

	@Test
	public void test3() {
		Set<String> expected = new HashSet<>(Arrays.asList(
				"((()))",
				"(()())",
				"(())()",
				"()(())",
				"()()()")
		);
		Assert.assertEquals(expected, new HashSet<>(solution.generateParenthesis(3)));
	}
}
