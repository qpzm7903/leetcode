package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author qpzm7903
 * @since 2020-04-20-6:52
 */

public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        stack.push(root);
        root = root.right;
        while (!stack.isEmpty()) {
            while (root!=null){
                stack.push(root);
                root = root.right;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.left;
        }
        return list;
    }
}
