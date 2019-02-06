package intermediate;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        doTraversal(result, root);
        return result;
    }

    private void doTraversal(List<Integer> list, TreeNode node) {
        if (node.left != null)
            doTraversal(list, node.left);
        list.add(node.val);
        if (node.right != null)
            doTraversal(list, node.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
