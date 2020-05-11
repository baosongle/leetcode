package contest.contest126;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfWordIsValidAfterSubstitutionsTest {
	private CheckIfWordIsValidAfterSubstitutions solution = new CheckIfWordIsValidAfterSubstitutions();

	@Test
	public void test0() {
		String s = "aabcbc";
		Assert.assertTrue(solution.isValid(s));
	}

	@Test
	public void test1() {
		String s = "abcabcababcc";
		Assert.assertTrue(solution.isValid(s));
	}

	@Test
	public void test4() {
		String s = "aabcbcabc";
		Assert.assertTrue(solution.isValid(s));
	}

	@Test
	public void test2() {
		String s = "abccba";
		Assert.assertFalse(solution.isValid(s));
	}

	@Test
	public void test3() {
		String s = "cababc";
		Assert.assertFalse(solution.isValid(s));
	}

	@Test
	public void test5() {
		String s = "aabcbabcc";
		Assert.assertTrue(solution.isValid(s));
	}
}
