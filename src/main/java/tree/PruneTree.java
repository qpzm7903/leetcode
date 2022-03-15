package tree;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2022-03-15-21:11
 */
public class PruneTree {

    /**
     * 如果某个节点的值为0，且子树的值也为0，就可以剪出
     *
     * @param root
     * @return
     */
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
