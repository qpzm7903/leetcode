package BFS;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-05-03-10:47
 */

public class Solution32 {
    public int[] levelOrder(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            res.add(poll.val);
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);

        }
        int[] ans = new int[res.size()];
        int index = 0;
        for (Integer re : res) {
            ans[index++] = re;
        }
        return ans;
    }
}
