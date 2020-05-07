package dp;

/**
 * @author qpzm7903
 * @since 2020-05-07-21:57
 */

public class Knapsack01 {
    public int knapsack01(int weight, int[] values, int[] weights) {
        int[][] dp = new int[values.length + 1][weight + 1];
        for (int i = 1; i < values.length + 1; i++) {
            for (int j = 1; j < weight + 1; j++) {
                if (j - weights[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        return dp[values.length][weight];

    }
}
