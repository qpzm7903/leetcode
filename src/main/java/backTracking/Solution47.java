package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-29-7:57
 */

public class Solution47 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, path, used);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i>0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            path.addLast(nums[i]);

            used[i] = true;
            dfs(nums, path, used);
            used[i] = false;

            path.removeLast();
        }
    }
}
