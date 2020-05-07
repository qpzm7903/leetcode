package backTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-02-15:31
 */

public class Solution216 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(candidates,n,k,new LinkedList<Integer>(),0);
        return res;
    }

    /**
     *
     * @param startIndex 每次搜索开始的位置，保证不重复，并且这样保证了递增
     */
    private void dfs(int[] candidates, int target, int k, LinkedList<Integer> temp,int startIndex) {
        if (temp.size() == k) {
            if (target == 0) {
                res.add(new LinkedList<>(temp));
            }
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            temp.addLast(candidates[i]);
            dfs(candidates, target - candidates[startIndex], k, temp, i + 1);
            temp.removeLast();
        }
    }
}
