package support.tree;

import java.util.Objects;

public class TreeAlgorithms {
	public static void insert(TreeNode root, TreeNode node) {
		Objects.requireNonNull(root);
		Objects.requireNonNull(node);

		TreeNode current = root;
		while (true) {
            if (node.val <= current.val) {
            	if (current.left == null) {
            		current.left = node;
            		return;
				}
            	current = current.left;
			} else {
				if (current.right == null) {
					current.right = node;
					return;
				}
				current = current.right;
			}
		}
	}
}
