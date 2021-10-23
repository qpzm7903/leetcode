package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-23-14:37
 */
public class Solution45 {
    /**
     * 贪心，抄自官方
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int n = nums.length;
        int step = 0;
        int maxPosition = 0;
        int lastBoundary = 0;
        for (int i = 0; i < n - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == lastBoundary) {
                // jump
                lastBoundary = maxPosition;
                step++;
            }
        }
        return step;
    }
}
