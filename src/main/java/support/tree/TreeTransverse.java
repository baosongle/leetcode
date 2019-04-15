package support.tree;

public class TreeTransverse {
	public static void preOrderTransverse(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val);
		System.out.print(" ");
		preOrderTransverse(root.left);
		preOrderTransverse(root.right);
	}

	public static void inOrderTransverse(TreeNode root) {
		if (root == null)
			return;
		inOrderTransverse(root.left);
		System.out.print(root.val);
		System.out.print(" ");
		inOrderTransverse(root.right);
	}

	public static void postOrderTransverse(TreeNode root) {
		if (root == null)
			return;
		postOrderTransverse(root.left);
		postOrderTransverse(root.right);
		System.out.print(root.val);
		System.out.print(" ");
	}
}
