package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-24-8:15
 */
public class Solution53 {
    /**
     * 这里的动态规划算法推到过程很好玩
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int x : nums) {
            pre = Math.max(x, pre + x);
            max = Math.max(max, pre);
        }
        return max;
    }
}
