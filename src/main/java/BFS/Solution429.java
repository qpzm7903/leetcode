package BFS;

import tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-05-03-10:36
 */

public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                temp.add(poll.val);
                queue.addAll(poll.children);
            }
            res.add(temp);
        }
        LinkedList<List<Integer>> ans = new LinkedList<>();
        while (!res.isEmpty())ans.addLast(res.removeLast());
        return ans;
    }
}
