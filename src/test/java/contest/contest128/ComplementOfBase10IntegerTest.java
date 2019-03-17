package contest.contest128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplementOfBase10IntegerTest {
	private ComplementOfBase10Integer solution = new ComplementOfBase10Integer();

	@Test
	public void test0() {
		Assertions.assertEquals(2, solution.bitwiseComplement(5));
	}

	@Test
	public void test1() {
		Assertions.assertEquals(0, solution.bitwiseComplement(7));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(5, solution.bitwiseComplement(10));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(1, solution.bitwiseComplement(0));
	}
}
