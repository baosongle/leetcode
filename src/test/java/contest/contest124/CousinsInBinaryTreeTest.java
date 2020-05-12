package contest.contest124;

import org.junit.Assert;
import org.junit.Test;

public class CousinsInBinaryTreeTest {
	private CousinsInBinaryTree solution = new CousinsInBinaryTree();

	@Test
	public void test() {
		CousinsInBinaryTree.TreeNode root = new CousinsInBinaryTree.TreeNode(1);
		root.left = new CousinsInBinaryTree.TreeNode(2);
		root.right = new CousinsInBinaryTree.TreeNode(3);
		Assert.assertTrue(solution.isCousins(root, 2, 3));
		Assert.assertFalse(solution.isCousins(root, 1, 2));
		Assert.assertFalse(solution.isCousins(root, 1, 3));
		Assert.assertFalse(solution.isCousins(root, 1, 4));
		Assert.assertFalse(solution.isCousins(root, 2, 4));
		Assert.assertFalse(solution.isCousins(root, 5, 4));
	}
}
