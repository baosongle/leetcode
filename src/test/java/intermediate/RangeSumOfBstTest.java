package intermediate;

import org.junit.Assert;
import org.junit.Test;
import support.tree.TreeGenerator;
import support.tree.TreeNode;

public class RangeSumOfBstTest {
	private RangeSumOfBst solution = new RangeSumOfBst();

	@Test
	public void test0() {
		TreeGenerator generator = new TreeGenerator(15, 0, 100, 1);
		TreeNode root = generator.randomTree();
		Assert.assertEquals(731, solution.rangeSumBST(root, 13, 88));
	}
}
