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

    // todo
    public static  List<TreeNode> postorderTraversalByIter(TreeNode root){
        List<TreeNode> nodes = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            nodes.add(cur);
            cur = cur.right;
        }
        return nodes;
    }

}
