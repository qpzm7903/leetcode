package tree;

/**
 * @author qpzm7903
 * @since 2020-04-19-10:24
 */

public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
