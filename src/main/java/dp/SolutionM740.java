package dp;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-19-22:37
 */
public class SolutionM740 {
    public int deleteAndEarn(int[] nums) {
        int maxValue = 0;
        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }
        int[] items = new int[maxValue + 1];
        for (int num : nums) {
            items[num] += num;
        }
        return rob(items);

    }

    private int rob(int[] items) {
        int pre = items[0];
        int curr = Math.max(items[0], items[1]);
        int temp;
        for (int i = 2; i < items.length; i++) {
            temp = curr;
            curr = Math.max(curr,items[i] + pre);
            pre = temp;
        }
        return curr;
    }
}
