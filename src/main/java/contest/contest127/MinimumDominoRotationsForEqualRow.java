package contest.contest127;

import java.util.*;

public class MinimumDominoRotationsForEqualRow {
	public int minDominoRotations(int[] A, int[] B) {
		if (allEqual(A) || allEqual(B))
			return 0;

		List<Integer> list = getEqualElement(A, B);
		if (list.size() == 0)
			return -1;

		int target = list.get(0);
		int a = flipCount(A, target);
		int b = flipCount(B, target);
		return Math.min(a, b);
	}

	private boolean allEqual(int[] A) {
		int b = A[0];
		for (int a : A) {
			if (a != b)
				return false;
		}
		return true;
	}

	private List<Integer> getEqualElement(int[] A, int[] B) {
		int length = A.length;
		int x = A[0];
		int y = B[0];
		Set<Integer> set = new HashSet<>();
		Collections.addAll(set, x, y);
		for (int i = 1; i < length; i++) {
			int a = A[i];
			int b = B[i];

			Set<Integer> set1 = new HashSet<>();
			Collections.addAll(set1, a, b);

			set.retainAll(set1);
			if (set.size() == 0)
                return Collections.emptyList();
		}
		return new ArrayList<>(set);
	}

	private int elementCount(int[] A, int element) {
		int count = 0;
		for (int a : A) {
			if (a == element)
				count++;
		}
		return count;
	}

	private int flipCount(int[] A, int target) {
		int count = elementCount(A, target);
		if (count < (A.length / 2))
			return count;
		else
			return A.length - count;
	}
}
