package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeNode;

public class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    public void test0() {
        Assert.assertEquals(0, solution.maxDepth(null));
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        Assert.assertEquals(1, solution.maxDepth(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        Assert.assertEquals(2, solution.maxDepth(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        Assert.assertEquals(2, solution.maxDepth(root));
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        Assert.assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void test5() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left = new TreeNode(1);
        Assert.assertEquals(2, solution.maxDepth(root));
    }
}
