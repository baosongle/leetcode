package easy;

import support.tree.TreeNode;
import support.tree.TreeTransverse;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBst {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeTransverse.inOrderTransverse(root, (val) -> {
            if (list.isEmpty()) {
                list.add(val);
                list.add(Integer.MAX_VALUE);
                return null;
            }
            int last = list.remove(0);
            int diff = val - last;
            list.add(0, val);
            if (diff < list.get(1))
                list.set(1, diff);
            return null;
        });

        return list.get(1);
    }
}
