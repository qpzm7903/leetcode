package tree;

/**
 * @author qpzm7903
 * @since 2020-04-22-7:11
 */

public class Solution513 {
    int maxDepth = -1;
    int res = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
            res = root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
