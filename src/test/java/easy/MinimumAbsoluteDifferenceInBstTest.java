package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeGenerator;
import support.tree.TreeNode;

public class MinimumAbsoluteDifferenceInBstTest {
    private MinimumAbsoluteDifferenceInBst solution = new MinimumAbsoluteDifferenceInBst();

    @Test
    public void test0() {
        TreeGenerator generator = new TreeGenerator(10, 0, 100, 1);
        TreeNode root = generator.randomTree();
        Assert.assertEquals(1, solution.getMinimumDifference(root));
    }

    @Test
    public void test1() {
        TreeGenerator generator = new TreeGenerator(10, 0, 100, 2);
        TreeNode root = generator.randomTree();
        Assert.assertEquals(1, solution.getMinimumDifference(root));
    }

    @Test
    public void test2() {
        TreeGenerator generator = new TreeGenerator(100, 0, 10000, 4);
        TreeNode root = generator.randomTree();
        Assert.assertEquals(1, solution.getMinimumDifference(root));
    }
}
