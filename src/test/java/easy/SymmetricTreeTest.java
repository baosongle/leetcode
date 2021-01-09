package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeNode;

public class SymmetricTreeTest {
    private final SymmetricTree solution = new SymmetricTree();

    @Test
    public void test0() {
        TreeNode node = new TreeNode(1);
        Assert.assertTrue(solution.isSymmetric(node));
    }

    @Test
    public void test1() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        Assert.assertTrue(solution.isSymmetric(node));
    }

    @Test
    public void test2() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right.left = new TreeNode(3);
        Assert.assertFalse(solution.isSymmetric(node));
    }

    @Test
    public void test3() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right.right = new TreeNode(3);
        Assert.assertTrue(solution.isSymmetric(node));
    }

    @Test
    public void test4() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right.right = new TreeNode(4);
        Assert.assertFalse(solution.isSymmetric(node));
    }

    @Test
    public void test5() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(3);
        Assert.assertFalse(solution.isSymmetric(node));
    }

    @Test
    public void test6() {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(2);
        Assert.assertFalse(solution.isSymmetric(node));
    }

    @Test
    public void test7() {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(2);
        Assert.assertFalse(solution.isSymmetric(node));
    }
}
