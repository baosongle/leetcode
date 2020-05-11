package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumTest {
    private ThreeSum solution = new ThreeSum();

    @Test
    public void test() {
        Assert.assertEquals(2, solution.threeSum(-1, 0, 1, 2, -1, -4).size());
    }
}
