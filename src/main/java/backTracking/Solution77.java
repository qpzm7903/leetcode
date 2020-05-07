package backTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-02-10:28
 */

public class Solution77 {
    List<List<Integer>> res = new LinkedList<>();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> oneRes = new LinkedList<>();
        this.n = n;
        this.k = k;
        dfs(1, oneRes);
        return res;
    }

    private void dfs(int first, LinkedList<Integer> oneRes) {
        if (oneRes.size() == k) {
            res.add(new LinkedList<>(oneRes));
            return;
        }
        for (int i = first; i < n + 1; i++) {
            oneRes.addLast(i);
            dfs(i + 1, oneRes);
            oneRes.removeLast();
        }
    }

}
