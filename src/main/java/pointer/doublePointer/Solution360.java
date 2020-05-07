package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-26-22:03
 */

public class Solution360 {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        if (a > 0) {
            int index = right;
            while (left <= right) {
                int leftVal = function(nums[left], a, b, c);
                int rightVal = function(nums[right], a, b, c);
                if (leftVal < rightVal) {
                    res[index--] = rightVal;
                    right--;
                } else {
                    res[index--] = leftVal;
                    left++;
                }
            }
        } else {
            int index = 0;
            while (left <= right) {
                int leftVal = function(nums[left], a, b, c);
                int rightVal = function(nums[right], a, b, c);
                if (leftVal < rightVal) {
                    res[index++] = leftVal;
                    left++;
                } else {
                    res[index++] = rightVal;
                    right--;
                }
            }
        }

        return res;
    }

    int function(int x, int a, int b, int c) {
        return x * x * a + b * x + c;
    }


}
