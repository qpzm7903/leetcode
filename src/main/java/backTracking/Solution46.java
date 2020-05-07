package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-29-7:39
 */

public class Solution46 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        dfs(nums, path);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path) {

        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!path.contains(nums[i])) {
                path.add(nums[i]);
                dfs(nums, path);
                path.removeLast();
            }
        }
    }
}
