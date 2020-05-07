package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-05-21:36
 */

public class Solution42 {
    public int trap(int[] height) {

        int ans = 0;
        int pre = 0;
        int next = 0;
        int index = 0;
        int temp = 0;
        while (index < height.length) {
            if (height[pre] != 0) {
                break;
            }
            pre = index;
            index++;
        }
        next = pre + 1;
        while (index < height.length && next < height.length) {
            if (height[next] >= height[pre] ) {
                ans += (next - pre - 1) * Math.min(height[next], height[pre]) - temp;
                pre = next;
                temp = 0;
            } else {
                temp += height[next];
            }
            next++;
            index++;

        }
        return ans;
    }
}
