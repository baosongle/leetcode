package easy;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeNode;

public class SameTreeTest {
    private SameTree solution = new SameTree();

    @Test
    public void test0() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test1() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test2() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test3() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test4() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test5() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test6() {
        Assert.assertTrue(solution.isSameTree(null, null));
    }

    @Test
    public void test7() {
        TreeNode p = new TreeNode(1);
        Assert.assertFalse(solution.isSameTree(p, null));
    }

    @Test
    public void test8() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(4);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test9() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(4);

        TreeNode q = new TreeNode(2);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }
}
