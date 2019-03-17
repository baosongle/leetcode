package contest.contest128;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
	public int numPairsDivisibleBy60(int[] time) {
		int pairs = 0;
		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				int a = time[i] + time[j];
				if (a % 60 == 0)
					pairs++;
			}
		}
		return pairs;
	}
}
