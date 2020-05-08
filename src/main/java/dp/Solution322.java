package dp;

import java.util.Arrays;

/**
 * @author qpzm7903
 * @since 2020-03-17-22:47
 */

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return 0;
        }
        Arrays.sort(coins);
        if(amount==0){
            return 0;
        }
        if (amount < coins[0]) {
            return 0;
        }
        for (int coin : coins) {
            if (amount == coin) {
                return 1;
            }
        }
        int[] status = new int[amount + 1];
        for (int i = 0; i < status.length; i++) {
            status[i] = amount + 1;
        }
        for (int i = 0; i < coins.length; i++) {
            status[coins[i]] = 1;
        }
        for (int i = 0; i < status.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] + i <= amount) {
                    status[coins[j] + i] = Math.min(status[i] + 1, status[coins[j] + i]);
                }
            }
        }
        return status[amount] == amount + 1 ? -1 : status[amount];
    }

    /**
     * @since 2020-05-07
     */
    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = 0; i <= amount; i++) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}
