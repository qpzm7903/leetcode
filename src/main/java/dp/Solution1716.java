package dp;

/**
 * @author qpzm7903
 * @since 2020-03-24-21:35
 */

public class Solution1716 {
    int maxCount = 0;

    public int massage(int[] nums) {
        helper(nums, 0, 0);
        return maxCount;
    }

    void helper(int[] nums, int currIndex, int currCount) {
        if (currIndex < nums.length) {
            helper(nums, currIndex + 2, currCount + nums[currIndex]);
            helper(nums, currIndex + 1, currCount);
        }
        maxCount = Math.max(maxCount, currCount);
    }
}
