package contest.contest127;

public class ConstructBinarySearchTreeFromPreorderTraversal {
	public TreeNode bstFromPreorder(int[] preorder) {
		TreeNode node = new TreeNode(preorder[0]);
		for (int i = 1; i < preorder.length; i++) {
			int val = preorder[i];
			insertToTree(node, val);
		}
		return node;
	}

	private void insertToTree(TreeNode root, int val) {
		TreeNode node = root;
		if (val < node.val) {
			if (node.left == null) {
				node.left = new TreeNode(val);
				return;
			}
			node = transverse(node, true);
		} else {
			if (node.right == null) {
				node.right = new TreeNode(val);
				return;
			}
			node = transverse(node, false);
		}
		insertToTree(node, val);
	}

	private TreeNode transverse(TreeNode node, boolean left) {
		if (left)
			return node.left;
		else
			return node.right;
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
