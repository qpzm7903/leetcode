package dp;

/**
 * @author qpzm7903
 * @since 2020-05-09-7:36
 */

public class Solution72 {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 * length2 == 0) {
            return length1 + length2;
        }

        int[][] dp = new int[length1 + 1][length2 + 1];
        for (int i = 0; i <= length1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= length2; j++) {
            dp[0][j] = j;
        }
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    int insert = dp[i + 1][j] + 1;
                    int delete = dp[i][j + 1] + 1;
                    int replace = dp[i][j] + 1;
                    dp[i + 1][j + 1] = Math.min(Math.min(insert, delete), replace);
                }
            }
        }
        return dp[length1][length2];
    }
}
