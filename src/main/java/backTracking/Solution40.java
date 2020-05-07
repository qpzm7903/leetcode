package backTracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-02-14:07
 */

public class Solution40 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // 记录已经使用的
        boolean[] used = new boolean[candidates.length];
        dfs(candidates, target, new LinkedList<>(),used);
        return res;
    }

    private void dfs(int[] candidates, int target, LinkedList<Integer> temp,boolean[] used) {
        if (target == 0) {
            res.add(new LinkedList<>(temp));
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            // 已经使用过就直接剪枝
            if (used[i]) continue;
            // 重复元素剪枝，比如 1 1  3 ，同层的第二个一不需要搜索
            if (i > 0 && candidates[i] == candidates[i-1] && !used[i-1]) continue;
            // 前面排序之后，结构一定是递增的，所以如果出现了递减就剪枝
            if (temp.size() >0 && temp.peekLast()<candidates[i]) continue;
            used[i] = true;
            temp.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], temp, used);
            temp.removeLast();
            used[i] = false;
        }
    }

}
