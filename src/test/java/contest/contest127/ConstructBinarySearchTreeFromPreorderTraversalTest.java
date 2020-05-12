package contest.contest127;

import org.junit.Test;

public class ConstructBinarySearchTreeFromPreorderTraversalTest {
	private ConstructBinarySearchTreeFromPreorderTraversal solution = new ConstructBinarySearchTreeFromPreorderTraversal();

	@Test
	public void test0() {
		int[] a = {8,5,1,7,10,12};
		ConstructBinarySearchTreeFromPreorderTraversal.TreeNode root = solution.bstFromPreorder(a);
		System.out.println(root);
	}
}
