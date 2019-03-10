package contest.contest127;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
	public int largestSumAfterKNegations(int[] A, int K) {
		flip(A, K);

        int sum = 0;
		for (int a : A)
			sum += a;

		return sum;
	}

	private int[] flip(int[] A, int K) {
		if (K == 0)
			return A;
		Arrays.sort(A);
		A[0] = -A[0];
		return flip(A, K - 1);
	}
}
