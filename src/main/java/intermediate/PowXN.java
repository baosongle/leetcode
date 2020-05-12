package intermediate;

public class PowXN {
	public double myPow(double x, int n) {
		if (n == 0 || x == 1D) {
			return 1;
		} else if (n > 0) {
			if (n % 2 == 0) {
				return myPow(x * x, n / 2);
			} else if (n % 3 == 0) {
				return myPow(x * x * x, n / 3);
			} else {
				return myPow(x, n - 1) * x;
			}
		} else {
			if (n == Integer.MIN_VALUE) {
				return myPow(x, n + 1) / x;
			} else {
				return myPow(1 / x, -n);
			}
		}
	}
}
