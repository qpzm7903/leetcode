package tree;

/**
 * @author qpzm7903
 * @since 2020-04-20-6:47
 */

public class Solution0410 {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        pre_order(t1, sb1);
        pre_order(t2, sb2);
        String tree1 = sb1.toString();
        String tree2 = sb2.toString();
        if (tree1.contains(tree2)) {
            return true;
        } else {
            return false;
        }
    }

    void pre_order(TreeNode root, StringBuilder sb){
        if (root == null){
            sb.append("null");
            return;
        }
        sb.append(root.val);
        pre_order(root.left, sb);
        pre_order(root.right, sb);
    }


}
