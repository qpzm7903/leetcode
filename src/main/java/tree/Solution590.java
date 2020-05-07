package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-19-10:15
 */

public class Solution590 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }
        if (root.children != null) {
            for (Node child : root.children) {
                dfs(child);
            }
            res.add(root.val);
        }
    }

}
