package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-19-22:08
 */
public class Solution213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robInner(nums, 0, nums.length - 2), robInner(nums, 1, nums.length - 1));
    }

    public int robInner(int[] nums, int start, int end) {
        int pre = nums[start];
        int curr = Math.max(nums[start], nums[start + 1]);
        int tmp;
        for (int i = start + 2; i <= end; i++) {
            tmp = curr;
            curr = Math.max(pre + nums[i], curr);
            pre = tmp;
        }
        return curr;
    }
}
