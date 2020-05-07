import java.util.Arrays;

/**
 * @author qpzm7903
 * @since 2020-03-08-7:01
 */

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            int temp = helper(coins, i, amount);
            if (temp !=0 && temp < res) {
                res = temp;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;
        } else {
            return res;
        }
    }

    private int helper(int[] coins, int i, int amount) {
        int res = 0;
        for (int j = i; j >= 0; j--) {
            if (amount == 0) {
                return res;
            }
            if (amount >= coins[j]) {
                int temp = amount / coins[j];
                amount -= (temp * coins[j]);
                res += temp;
            }
        }
        if (amount == 0) {
            return res;
        } else {
            return 0;
        }
    }
}
