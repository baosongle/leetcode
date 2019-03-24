package contest.contest129;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArrayIntoThreePartsWithEqualSumTest {
	private PartitionArrayIntoThreePartsWithEqualSum solution = new PartitionArrayIntoThreePartsWithEqualSum();

	@Test
	public void test0() {
		int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
		Assertions.assertTrue(solution.canThreePartsEqualSum(A));
	}

	@Test
	public void test1() {
		int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
		Assertions.assertFalse(solution.canThreePartsEqualSum(A));
	}

	@Test
	public void test2() {
		int[] A = {3,3,6,5,-2,2,5,1,-9,4};
		Assertions.assertTrue(solution.canThreePartsEqualSum(A));
	}

	@Test
	public void test3() {
		int[] A = {3};
		Assertions.assertFalse(solution.canThreePartsEqualSum(A));
	}
}
