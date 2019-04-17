package support.tree;

import org.junit.jupiter.api.Test;

public class TestTreeTransverse {
	@Test
	public void testPreOrderTransverse() {
		TreeGenerator generator = new TreeGenerator(15, 0, 100, 1);
		TreeNode root = generator.randomTree();
		TreeTransverse.preOrderTransverse(root);
		System.out.println();
	}

	@Test
	public void testInOrderTransverse() {
		TreeGenerator generator = new TreeGenerator(15, 0, 1000);
		TreeNode root = generator.randomTree();
		TreeTransverse.inOrderTransverse(root);
		System.out.println();
	}

	@Test
	public void testPostOrderTransverse() {
		TreeGenerator generator = new TreeGenerator(15, 0, 100, 1);
		TreeNode root = generator.randomTree();
		TreeTransverse.postOrderTransverse(root);
		System.out.println();
	}
}
