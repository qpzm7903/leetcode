package tree;

/**
 * @author qpzm7903
 * @since 2020-04-19-21:01
 */

public class Solution1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[left]);
        int subRight = left +1;
        for (; subRight <= right; subRight ++) {
            if (preorder[subRight] > root.val) {
                break;

            }
        }
        root.left = helper(preorder,left+1,subRight-1);
        root.right = helper(preorder,subRight,right);
        return root;
    }
}
