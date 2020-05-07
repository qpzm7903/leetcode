package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-26-20:14
 */

public class Solution11 {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                res = Math.max(height[left] * (right - left), res);
                left++;
            } else {
                res = Math.max(height[right] * (right - left), res);
                right--;
            }
        }
        return res;
    }
}
