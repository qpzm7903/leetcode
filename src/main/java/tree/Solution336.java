package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-19-9:13
 */

public class Solution336 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> findLeaves(TreeNode root) {
        dfs(root);
        return res;
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int currHigh = Math.max(left, right) + 1;
        if (currHigh >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(currHigh).add(root.val);
        return currHigh;
    }
}
