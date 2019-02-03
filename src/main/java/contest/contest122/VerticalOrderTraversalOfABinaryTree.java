package contest.contest122;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversalOfABinaryTree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        transvers(treeMap, root, 0);

        List<List<Integer>> answer = new ArrayList<>();
        Integer lastKey = null;
        for (Integer key : treeMap.keySet()) {
            if (lastKey == null) {
                List<Integer> list = new ArrayList<>();
                list.add(treeMap.get(key));
                answer.add(list);
                lastKey = key;
                continue;
            }
            if (key.equals(lastKey)) {
                List<Integer> list = answer.get(key);
                Integer o = list.stream().filter(i -> i > key).findFirst().orElse(null);
                int index = o == null ? list.size() : list.indexOf(o);
                list.add(index, treeMap.get(key));
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(treeMap.get(key));
                answer.add(list);
                lastKey = key;
            }
        }
        return answer;
    }

    private void transvers(Map<Integer, Integer> map, TreeNode node, int key) {
        map.put(key, node.val);
        if (node.left != null)
            transvers(map, node.left, key - 1);
        if (node.right != null)
            transvers(map, node.right, key + 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
