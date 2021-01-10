package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeNode;

public class BalancedBinaryTreeTest {
    private final BalancedBinaryTree solution = new BalancedBinaryTree();

    @Test
    public void test0() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        Assert.assertTrue(solution.isBalanced(root));
    }

    @Test
    public void test1() {
        Assert.assertTrue(solution.isBalanced(null));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        Assert.assertFalse(solution.isBalanced(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        root.right.right.right = new TreeNode(0);
        Assert.assertFalse(solution.isBalanced(root));
    }
}
