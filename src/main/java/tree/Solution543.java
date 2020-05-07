package tree;


/**
 * @author qpzm7903
 * @since 2020-03-10-6:38
 */

public class Solution543 {
    int maxlength = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        help(root);
        return maxlength;
    }

    public int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = help(root.left);

        int right = help(root.right);
        maxlength = Math.max(left + right + 1, maxlength);
        return Math.max(left, right) + 1;
    }


}
