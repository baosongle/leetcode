package contest.contest128;

import org.junit.Assert;
import org.junit.Test;

public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {
	private PairsOfSongsWithTotalDurationsDivisibleBy60 solution = new PairsOfSongsWithTotalDurationsDivisibleBy60();

	@Test
	public void test0() {
		int[] array = {30,20,150,100,40};
		Assert.assertEquals(3, solution.numPairsDivisibleBy60(array));
	}
}
