package easy;

import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {
    private SameTree solution = new SameTree();

    @Test
    public void test0() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        SameTree.TreeNode q = new SameTree.TreeNode(1);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test1() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test2() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(3);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(3);

        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test3() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test4() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(3);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test5() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(3);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test6() {
        Assert.assertTrue(solution.isSameTree(null, null));
    }

    @Test
    public void test7() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        Assert.assertFalse(solution.isSameTree(p, null));
    }

    @Test
    public void test8() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(4);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test9() {
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(4);

        SameTree.TreeNode q = new SameTree.TreeNode(2);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(solution.isSameTree(p, q));
    }
}
