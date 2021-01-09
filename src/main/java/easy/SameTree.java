package easy;

import support.tree.TreeNode;

// https://leetcode-cn.com/problems/same-tree/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null)
            return false;
        if (q == null)
            return false;

        return transvers(p, q);
    }

    private boolean transvers(TreeNode p, TreeNode q) {
        if (p.val != q.val)
            return false;
        if (p.left != null && q.left != null) {
            if (!transvers(p.left, q.left))
                return false;
        } else if (p.left == null && q.left != null) {
            return false;
        } else if (p.left != null)
            return false;

        if (p.right != null && q.right != null) {
            if (!transvers(p.right, q.right))
                return false;
        } else if (p.right == null && q.right != null) {
            return false;
        } else if (p.right != null)
            return false;

        return true;
    }
}

