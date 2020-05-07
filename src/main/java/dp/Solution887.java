package dp;

/**
 * @author qpzm7903
 * @since 2020-04-12-10:06
 */

public class Solution887 {
    public int superEggDrop(int K, int N) {
        int egg = K;
        int floor = N;

        int[][] dp = new int[floor + 1][egg + 1];
        for (int i = 1; i <= floor; i++) {
            dp[i][1] = i;
        }
        for (int i = 1; i <= egg; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= floor; i++) {
            for (int j = 2; j <= egg; j++) {
                int low = 1;
                int high = i;
                while (low + 1 < high) {
                    int x = (low + high) / 2;
                    int t1 = dp[x - 1][j - 1];
                    int t2 = dp[i - x][j];
                    if (t1 < t2) {
                        low = x;
                    } else if (t1 > t2) {
                        high = x;
                    } else {
                        low = x;
                        high = x;
                    }
                }
                dp[i][j] = 1 + Math.min(Math.max(dp[low - 1][j - 1], dp[i - low][j]),
                        Math.max(dp[high - 1][j - 1], dp[i - high][j]));
            }
        }
        return dp[floor][egg];
    }

}
