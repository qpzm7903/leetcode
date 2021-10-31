package dp;

/**
 * 环形数组求最大值
 *
 * @author qpzm7903
 * @since 2021-10-24-11:03
 */
public class Solution918 {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0];
        int max_ending_here = nums[0];
        int max_so_far = nums[0];
        int min_ending_here = nums[0];
        int min_so_far = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            max_ending_here = Math.max(max_ending_here + nums[i], nums[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);

            min_ending_here = Math.min(min_ending_here + nums[i], nums[i]);
            min_so_far = Math.min(min_so_far, min_ending_here);

        }
        if (sum < 0 && sum == min_so_far) {
            return max_so_far;
        }
        return Math.max(max_so_far, sum - min_so_far);
    }
}
