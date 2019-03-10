package contest.contest127;

public class ClumsyFactorial {
	public int clumsy(int N) {
		int result = timeDivideAdd(N, true);
		N -= 4;
		while (N >= 1) {
			result -= timeDivideAdd(N, false);
			N -= 4;
		}
		return result;
	}

	private int timeDivideAdd(int n, boolean first) {
		if (n >= 4) {
			if (first)
				return n * (n - 1) / (n - 2) + (n - 3);
			else
				return n * (n - 1) / (n - 2) - (n - 3);
		} else if (n == 3) {
            return 6;
		} else if (n == 2) {
			return 2;
		} else if (n == 1) {
			return 1;
		}
		throw new IllegalArgumentException("n 不能小于等于 0");
	}
}
