package tree.traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public static List<TreeNode> postorderTraversalByRecurse(TreeNode root) {
        List<TreeNode> nodes = new LinkedList<>();
        dfs(root, nodes);
        return nodes;

    }

    private static void dfs(TreeNode root, List<TreeNode> nodes) {
        if (root != null) {
            dfs(root.left, nodes);
            dfs(root.right, nodes);
            nodes.add(root);
        }
    }

    public static  List<TreeNode> postorderTraversalByIter(TreeNode root){
        List<TreeNode> nodes = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right != null && cur.right != pre) {
                cur = cur.right;
            } else {
                cur = stack.pop();
                nodes.add(cur);
                pre = cur;
                cur = null;
            }
        }
        return nodes;
    }

}
