package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-04-22-7:04
 */

public class Solution32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> leverList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                leverList.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            ans.add(leverList);
        }
        return ans;
    }
}
