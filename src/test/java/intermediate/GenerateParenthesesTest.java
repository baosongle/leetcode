package intermediate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GenerateParenthesesTest {
	private GenerateParentheses solution = new GenerateParentheses();

	@Test
	public void test1() {
		Set<String> expected = new HashSet<>(Collections.singleton("()"));
		Assertions.assertEquals(expected, new HashSet<>(solution.generateParenthesis(1)));
	}

	@Test
	public void test2() {
		Set<String> expected = new HashSet<>(Arrays.asList("()()", "(())"));
		Assertions.assertEquals(expected, new HashSet<>(solution.generateParenthesis(2)));
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
		Assertions.assertEquals(expected, new HashSet<>(solution.generateParenthesis(3)));
	}
}
