package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-11-03-7:20
 */
public class Solution1567 {
    public int getMaxLen(int[] nums) {
        int length = nums.length;
        int pos = nums[0] > 0 ? 1 : 0;
        int neg = nums[0] < 0 ? 1 : 0;
        int maxLength = pos;
        for (int i = 1; i < length; i++) {
            if (nums[i] > 0) {
                pos++;
                neg = neg > 0 ? neg + 1 : 0;
            } else if (nums[i] < 0) {
                int newPos = neg > 0 ? neg + 1 : 0;
                int newNg = pos + 1;
                pos = newPos;
                neg = newNg;
            } else {
                pos = 0;
                neg = 0;
            }
            maxLength = Math.max(maxLength, pos);
        }
        return maxLength;

    }
}
