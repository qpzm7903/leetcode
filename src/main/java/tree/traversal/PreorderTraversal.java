package tree.traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    public static List<TreeNode> preorderTraversalByRecurse(TreeNode root) {
        List<TreeNode> nodes = new LinkedList<>();
        dfs(root, nodes);
        return nodes;

    }

    private static void dfs(TreeNode root, List<TreeNode> nodes) {
        if (root != null) {
            nodes.add(root);
            dfs(root.left, nodes);
            dfs(root.right, nodes);
        }
    }

    public static  List<TreeNode> preorderTraversalByIter(TreeNode root){
        List<TreeNode> nodes = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                /**
                 * 遍历的方式和中序遍历相同，主要是什么时候将当前节点加入结果集
                 */
                nodes.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return nodes;
    }

}
