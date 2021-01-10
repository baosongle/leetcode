package easy;

import support.tree.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isBalancedNode(root)) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private boolean isBalancedNode(TreeNode node) {
        if (node == null) {
            return true;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        return Math.abs(left - right) <= 1;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
}
