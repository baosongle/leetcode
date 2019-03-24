package contest.contest129;

import java.util.Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {
	public boolean canThreePartsEqualSum(int[] A) {
		int sum = Arrays.stream(A).sum();
		int target = sum / 3;
		if (target * 3 != sum)
			return false;

		int i0 = findEnd(A, target, 0);
		if (i0 == -1)
			return false;

		int i1 = findEnd(A, target, i0);
		if (i1 == -1)
			return false;

		int i2 = findEnd(A, target, i1);
		return i2 != -1;
	}

	private int findEnd(int[] A, int target, int start) {
		// end 不包括
		int sum = 0;
		int i;
		for (i = start; i < A.length; i++) {
			if (sum == target)
				break;
			sum += A[i];
		}
		if (sum == target)
			return i;
		else
			return -1;
	}
}
