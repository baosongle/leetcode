package contest.contest126;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfWordIsValidAfterSubstitutionsTest {
	private CheckIfWordIsValidAfterSubstitutions solution = new CheckIfWordIsValidAfterSubstitutions();

	@Test
	public void test0() {
		String s = "aabcbc";
		Assertions.assertTrue(solution.isValid(s));
	}

	@Test
	public void test1() {
		String s = "abcabcababcc";
		Assertions.assertTrue(solution.isValid(s));
	}

	@Test
	public void test4() {
		String s = "aabcbcabc";
		Assertions.assertTrue(solution.isValid(s));
	}

	@Test
	public void test2() {
		String s = "abccba";
		Assertions.assertFalse(solution.isValid(s));
	}

	@Test
	public void test3() {
		String s = "cababc";
		Assertions.assertFalse(solution.isValid(s));
	}

	@Test
	public void test5() {
		String s = "aabcbabcc";
		Assertions.assertTrue(solution.isValid(s));
	}
}
