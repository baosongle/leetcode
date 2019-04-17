package support.tree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TreeGenerator {
	private Random random;
	private boolean repeated;
	private int numberOfNodes;
	private int minVal;
	private int maxVal;

	private Set<Integer> numbers = new HashSet<>();

	public TreeGenerator(int numberOfNodes, int minVal, int maxVal) {
		this.random = new Random();
		this.numberOfNodes = numberOfNodes;
		this.minVal = minVal;
		this.maxVal = maxVal;
		this.repeated = false;
	}

	public TreeGenerator(int numberOfNodes, int minVal, int maxVal, int seed) {
		this(numberOfNodes, minVal, maxVal, seed, false);
	}

	public TreeGenerator(int numberOfNodes, int minVal, int maxVal, int seed, boolean repeated) {
		this.random = new Random(seed);
		this.numberOfNodes = numberOfNodes;
		this.minVal = minVal;
		this.maxVal = maxVal;
		this.repeated = repeated;
	}

	public TreeNode randomTree() {
        TreeNode root = new TreeNode(randomVal());
        for (int i = 1; i < numberOfNodes; i++) {
        	TreeAlgorithms.insert(root, new TreeNode(randomVal()));
		}
		return root;
	}

	private int randomVal() {
		int val = random.nextInt(maxVal - minVal) + minVal;
		if (repeated)
			return val;
		if (!numbers.contains(val)) {
			numbers.add(val);
			return val;
		}
		return randomVal();
	}
}
