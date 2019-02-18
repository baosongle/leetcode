package contest.contest124;

import java.util.ArrayList;
import java.util.List;

public class CousinsInBinaryTree {
	public boolean isCousins(TreeNode root, int x, int y) {
		List<Depth> depths = getDepths(root);

        int xDepth = -1;
        int xPVal = -1;
        for (Depth depth : depths) {
        	if (depth.val == x) {
				xDepth = depth.depth;
        		xPVal = depth.pVal;
			}
		}

		int yDepth = -1;
        int yPVal = -1;
		for (Depth depth : depths) {
			if (depth.val == y) {
				yDepth = depth.depth;
				yPVal = depth.pVal;
			}
		}

		if (xDepth == -1 && yDepth == -1)
			return false;
		if (xDepth != yDepth)
			return false;
		return xPVal != yPVal;
	}

	private List<Depth> getDepths(TreeNode root) {
		List<Depth> depths = new ArrayList<>();
		doGetDepths(depths, root, 0, -1);
		return depths;
	}

	private void doGetDepths(List<Depth> depths, TreeNode root, int currentDepth, int pVal) {
		Depth depth = new Depth();
		depth.val = root.val;
		depth.depth = currentDepth;
		depth.pVal = pVal;
		depths.add(depth);

		if (root.left != null)
			doGetDepths(depths, root.left, currentDepth + 1, root.val);
		if (root.right != null)
			doGetDepths(depths, root.right, currentDepth + 1, root.val);
	}

	static class Depth {
		int val;
		int depth;
		private int pVal;
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
