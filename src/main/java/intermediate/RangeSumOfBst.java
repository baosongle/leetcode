package intermediate;

import support.tree.TreeNode;
import static support.tree.TreeTransverse.inOrderTransverse;

import java.util.LinkedList;
import java.util.List;

public class RangeSumOfBst {
	public int rangeSumBST(TreeNode root, int L, int R) {
		List<Integer> sum = new LinkedList<>();
		sum.add(0);
		inOrderTransverse(root, (val) -> {
			if (val >= L && val <= R) {
				sum.set(0, sum.get(0) + val);
			}
			return null;
		});
		return sum.get(0);
	}
}
