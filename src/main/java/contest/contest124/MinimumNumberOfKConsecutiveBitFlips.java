package contest.contest124;

import java.util.Arrays;

public class MinimumNumberOfKConsecutiveBitFlips {
	public int minKBitFlips(int[] A, int K) {
		int[] f = new int[A.length];
		Arrays.fill(f, 1);

		int time = 0;
		while (!Arrays.equals(A, f)) {
			for (int x = 0; x < A.length; x++) {
				if (A[x] != f[x]) {
					try {
						flip(f, x, K);
					} catch (RuntimeException e) {
						return -1;
					}
					time++;
				}
			}
		}
		return time;
	}

	private void flip(int[] f, int start, int k) {
		boolean could = start >= 0 && start + k <= f.length;
		if (!could)
			throw new RuntimeException();
		for (int x = start; x < start + k; x++) {
			if (f[x] == 0) {
				f[x] = 1;
			} else if (f[x] == 1) {
				f[x] = 0;
			}
		}
	}
}
