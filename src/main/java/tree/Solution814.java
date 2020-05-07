package tree;

/**
 * @author qpzm7903
 * @since 2020-04-19-10:01
 */

public class Solution814 {
    public TreeNode pruneTree(TreeNode root) {
        boolean help = help(root);
        if (help) {
            return null;
        } else {
            return root;
        }
    }

    private boolean help(TreeNode root) {
        if (root == null) {
            return false;
        }

        boolean left = help(root.left);
        boolean right = help(root.right);
        if (!left) {
            root.left = null;
        }
        if (!right) {
            root.right = null;
        }
        return root.val == 1 || left || right;
    }
}
