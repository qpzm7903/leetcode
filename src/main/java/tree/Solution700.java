package tree;

/**
 * @author qpzm7903
 * @since 2020-04-19-10:19
 */

public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    private TreeNode dfs(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.val) {
            return dfs(root.right, val);
        } else if (val < root.val) {
            return dfs(root.left, val);
        }
        return root;
    }
}
