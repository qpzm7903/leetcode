package backTracking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-02-14:07
 */

public class Solution39 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> temp = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, temp, 0);
        return res;
    }

    private void dfs(int[] candidates, int target, LinkedList<Integer> temp, int startIndex) {
        if (target == 0) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {

            if (target - candidates[i] < 0) break;
            temp.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], temp, i);
            temp.removeLast();
        }
    }
}
