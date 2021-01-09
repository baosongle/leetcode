package easy;

import support.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> topDownList = new ArrayList<>();
        if (root == null) {
            return topDownList;
        }
        add(topDownList, Collections.singletonList(root));
        List<List<Integer>> downTopList = new ArrayList<>();
        for (int i = topDownList.size() - 1; i >= 0; i--) {
            downTopList.add(topDownList.get(i));
        }
        return downTopList;
    }
    
    private void add(List<List<Integer>> result, List<TreeNode> nodes) {
        List<Integer> list = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
        for (TreeNode n : nodes) {
            list.add(n.val);
            if (n.left != null) {
                nextLevel.add(n.left);
            }
            if (n.right != null) {
                nextLevel.add(n.right);
            }
        }
        result.add(list);
        if (nextLevel.size() > 0) {
            add(result, nextLevel);
        }
    }
}
