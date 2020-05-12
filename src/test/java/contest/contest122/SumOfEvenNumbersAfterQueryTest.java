package contest.contest122;

import org.junit.Assert;
import org.junit.Test;

public class SumOfEvenNumbersAfterQueryTest {
    private SumOfEvenNumbersAfterQueries solution = new SumOfEvenNumbersAfterQueries();

    @Test
    public void test() {
        int[] expected = {8, 6, 2, 4};

        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] actual = solution.sumEvenAfterQueries(A, queries);

        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
