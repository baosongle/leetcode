package contest.contest124;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfSquarefulArrays {
	public int numSquarefulPerms(int[] A) {
		List<Perm> perms = getSquarefulPerms(A);
		Perm perm = perms.remove(0);
		return numsSquarefulPerm(perms, perm, 0);
	}

	private int numsSquarefulPerm(List<Perm> perms, Perm perm, int result) {
		List<Perm> match = perms.stream()
				.filter(p -> p.a == perm.a || p.a == perm.b || p.b == perm.a || p.b == perm.b)
				.collect(Collectors.toList());
		perms.removeAll(match);

		for (Perm matchPerm : match) {
			result += numsSquarefulPerm(perms, matchPerm, result + 1);
		}
		return result;
	}

	private List<Perm> getSquarefulPerms(int[] A) {
		List<Perm> perms = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (isSquareful(A[i] + A[j]))
					perms.add(new Perm(i, j));
			}
		}
		return perms;
	}

	private static boolean isSquareful(int x) {
		double d = Math.sqrt(x);
		return d == (int) d;
	}

	static class Perm {
		private int a;
		private int b;

		public Perm(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}
