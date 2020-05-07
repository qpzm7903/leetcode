package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-28-22:13
 */

public class Solution487 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            if (i !=0)pre[i] = pre[i-1];
            if (nums[i] != 0) pre[i]++;
            else pre[i] = 0;
            res = Math.max(res, pre[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {

            if (i<nums.length-1) suff[i] = suff[i+1];
            if (nums[i] != 0)suff[i] ++;
            else suff[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            if (i > 0) temp += pre[i-1];
            if (i<nums.length-1) temp += suff[i+1];
            if (nums[i] == 0)temp += 1;
            res = Math.max(temp, res);
        }
        return res;
    }
}
