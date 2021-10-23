package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-23-14:12
 */
public class Solution55 {
    /**
     * 贪心算法
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
                if (max >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
