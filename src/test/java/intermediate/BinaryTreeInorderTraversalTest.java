package intermediate;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    public void test0() {
        Assert.assertEquals(new ArrayList<>(), solution.inorderTraversal(null));
    }

    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        Assert.assertEquals(list, solution.inorderTraversal(root));
    }

    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);

        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.left = new BinaryTreeInorderTraversal.TreeNode(2);
        Assert.assertEquals(list, solution.inorderTraversal(root));
    }

    @Test
    public void test3() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(2);
        root.left = new BinaryTreeInorderTraversal.TreeNode(3);
        root.right = new BinaryTreeInorderTraversal.TreeNode(1);
        Assert.assertEquals(list, solution.inorderTraversal(root));
    }

    @Test
    public void test4() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(2);
        root.left = new BinaryTreeInorderTraversal.TreeNode(3);
        root.right = new BinaryTreeInorderTraversal.TreeNode(1);
        root.left.left = new BinaryTreeInorderTraversal.TreeNode(4);
        Assert.assertEquals(list, solution.inorderTraversal(root));
    }
}
