package intermediate;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    public void test() {
        Assert.assertEquals(49, solution.maxArea(1,8,6,2,5,4,8,3,7));
    }
}
