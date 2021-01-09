package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeNode;

import java.util.List;

public class BinaryTreeLevelOrderTraversalIITest {
    private final BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    @Test
    public void test0() {
        Assert.assertTrue(solution.levelOrderBottom(null).isEmpty());
    }

    @Test
    public void test1() {
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        List<List<Integer>> list = solution.levelOrderBottom(node);
        Assert.assertEquals(1, list.get(0).get(0).intValue());
        Assert.assertEquals(2, list.get(0).get(1).intValue());
        Assert.assertEquals(0, list.get(1).get(0).intValue());
    }

    @Test
    public void test2() {
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.right.right = new TreeNode(4);
        List<List<Integer>> list = solution.levelOrderBottom(node);
        Assert.assertEquals(3, list.get(0).get(0).intValue());
        Assert.assertEquals(4, list.get(0).get(1).intValue());
        Assert.assertEquals(1, list.get(1).get(0).intValue());
        Assert.assertEquals(2, list.get(1).get(1).intValue());
        Assert.assertEquals(0, list.get(2).get(0).intValue());
    }
}
