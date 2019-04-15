package support.tree;

import java.util.Random;

public class TreeGenerator {
	private Random random;
	private int numberOfNodes;
	private int minVal;
	private int maxVal;

	public TreeGenerator(int numberOfNodes, int minVal, int maxVal) {
		this.random = new Random();
		this.numberOfNodes = numberOfNodes;
		this.minVal = minVal;
		this.maxVal = maxVal;
	}

	public TreeGenerator(int numberOfNodes, int minVal, int maxVal, int seed) {
        this.random = new Random(seed);
		this.numberOfNodes = numberOfNodes;
		this.minVal = minVal;
		this.maxVal = maxVal;
	}


	public TreeNode randomTree() {
        TreeNode root = new TreeNode(randomVal());
        for (int i = 1; i < numberOfNodes; i++) {
        	TreeAlgorithms.insert(root, new TreeNode(randomVal()));
		}
		return root;
	}

	private int randomVal() {
		return random.nextInt(maxVal - minVal) + minVal;
	}
}
