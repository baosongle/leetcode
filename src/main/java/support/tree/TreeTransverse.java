package support.tree;

import java.util.function.IntFunction;

public class TreeTransverse {
	public static void preOrderTransverse(TreeNode root, IntFunction intFunction) {
		if (root == null)
			return;
		intFunction.apply(root.val);
		preOrderTransverse(root.left, intFunction);
		preOrderTransverse(root.right, intFunction);
	}

	public static void preOrderTransverse(TreeNode root) {
		preOrderTransverse(root, (val) -> {
			System.out.print(val);
			System.out.print(" ");
			return null;
		});
	}

	public static void inOrderTransverse(TreeNode root, IntFunction intFunction) {
		if (root == null)
			return;
		inOrderTransverse(root.left, intFunction);
		intFunction.apply(root.val);
		inOrderTransverse(root.right, intFunction);
	}

	public static void inOrderTransverse(TreeNode root) {
	    inOrderTransverse(root, (val) -> {
			System.out.print(val);
			System.out.print(" ");
			return null;
		});
	}

	public static void postOrderTransverse(TreeNode root, IntFunction intFunction) {
		if (root == null)
			return;
		postOrderTransverse(root.left, intFunction);
		postOrderTransverse(root.right, intFunction);
		intFunction.apply(root.val);
	}

	public static void postOrderTransverse(TreeNode root) {
	    postOrderTransverse(root, (val) -> {
			System.out.print(val);
			System.out.print(" ");
			return null;
		});
	}
}
