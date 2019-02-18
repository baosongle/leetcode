package contest.contest124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CousinsInBinaryTreeTest {
	private CousinsInBinaryTree solution = new CousinsInBinaryTree();

	@Test
	public void test() {
		CousinsInBinaryTree.TreeNode root = new CousinsInBinaryTree.TreeNode(1);
		root.left = new CousinsInBinaryTree.TreeNode(2);
		root.right = new CousinsInBinaryTree.TreeNode(3);
		Assertions.assertTrue(solution.isCousins(root, 2, 3));
		Assertions.assertFalse(solution.isCousins(root, 1, 2));
		Assertions.assertFalse(solution.isCousins(root, 1, 3));
		Assertions.assertFalse(solution.isCousins(root, 1, 4));
		Assertions.assertFalse(solution.isCousins(root, 2, 4));
		Assertions.assertFalse(solution.isCousins(root, 5, 4));
	}
}
