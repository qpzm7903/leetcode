package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-19-10:26
 */

public class Solution589 {
    List<Integer> res = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return res;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                dfs(child);
            }
        }
    }
}
