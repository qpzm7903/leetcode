package tree;

/**
 * @author qpzm7903
 * @since 2020-04-19-11:47
 */

public class Solution54 {
    int ans = 0;
    int k = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (k == 0) {
            return;
        }
        k--;
        if (k == 0) {
            ans = root.val;
        }
        dfs(root.left);
    }
}
