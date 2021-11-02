package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-31-10:50
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], nums[i]), min * nums[i]);
            min = Math.min(Math.min(min * nums[i], nums[i]), temp * nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
