package contest.contest128;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
	public int shipWithinDays(int[] weights, int D) {
		int capacity = min(weights);
        int min = capacity;
        int max = max(weights);
		while (true) {
			if (canDoIt(weights, D, capacity)) {
				int newC = (capacity + min) / 2;
				if (newC == capacity)
					break;
				max = capacity;
				capacity = newC;
			} else {
				int newC = (capacity + max) / 2;
				if (newC == capacity)
					break;
				min = capacity;
				capacity = newC;
			}
		}

		if (canDoIt(weights, D, capacity - 1))
			return capacity - 1;
		if (canDoIt(weights, D, capacity))
			return capacity;
		if (canDoIt(weights, D, capacity + 1))
			return capacity + 1;
		return capacity;
	}

	private int min(int[] weights) {
		return Arrays.stream(weights).max().orElse(1);
	}

	private int max(int[] weights) {
		return Arrays.stream(weights).reduce((i1, i2) -> i1 + i2).orElse(1);
	}

	private boolean canDoIt(int[] weights, int D, int capacity) {
		int count = 0;
		int i = 0;
		for (int d = 0; d < D; d++) {
			for (; i < weights.length; i++) {
				count += weights[i];
				if (count == capacity) {
					i++;
					break;
				} else if (count > capacity) {
					break;
				}
			}
			count = 0;
		}
		return i == weights.length;
	}
}
