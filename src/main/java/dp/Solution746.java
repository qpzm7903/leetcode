package dp;

/**
 * <h2>使用最小花费爬楼梯</h2>
 *
 * <p>数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。</p>
 *
 * <p>每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。</p>
 *
 * <p>请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。</p>
 *
 * @author qpzm7903
 * @since 2021-10-18-20:18
 */
public class Solution746 {
    /**
     * <p>动态规划 迭代</p>
     * <p>假设dp[i] 是攀登到i台阶的最小花费值，那么</p>
     * <p>dp[i]=min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2])</p>
     * <p>然后使用自底向上的方法计算，也就是迭代，从0到n</p>
     * <p>初始化条件 dp[0] = dp[1] = 0</p>
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }

    /**
     * 发现只和前两个有关系，所以可以使用滚动数组
     * pre , curr
     *
     */
    public int minCostClimbingStairsWithRollingArray(int[] cost) {
        int pre = 0;
        int curr = 0;
        for (int i = 2; i <= cost.length; i++) {
            int next = Math.min(curr + cost[i - 1], pre + cost[i - 2]);
            pre = curr;
            curr = next;
        }
        return curr;
    }
}
