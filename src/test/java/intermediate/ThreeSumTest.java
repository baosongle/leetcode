package intermediate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {
    private ThreeSum solution = new ThreeSum();

    @Test
    public void test() {
        Assertions.assertEquals(2, solution.threeSum(-1, 0, 1, 2, -1, -4).size());
    }
}
