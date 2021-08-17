package dp;

/**
 * 最长回文子串
 *
 * @author qpzm7903
 * @since 2021-08-18-7:11
 */
public class Solution5 {

    /**
     * @since 2020-08-18-18
     */
    public static class Solution_1 {
        public String longestPalindrome(String s) {
            if (s.length() < 2) {
                return s;
            }

            int maxLength = 1;
            int begin = 0;
            boolean[][] dp = new boolean[s.length()][s.length()];
            for (int i = 0; i < s.length(); i++) {
                dp[i][i] = true;
            }
            char[] chars = s.toCharArray();
            for (int L = 2; L <= s.length(); L++) {

                for (int i = 0; i < s.length(); i++) {

                    int j = L + i - 1;
                    if (j >= s.length()) {
                        break;
                    }
                    if (chars[i] != chars[j]) {
                        dp[i][j] = false;
                    } else {
                        if (j - i < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }
                    if (dp[i][j] && L > maxLength) {
                        maxLength = L;
                        begin = i;
                    }
                }
            }
            return s.substring(begin, begin + maxLength);
        }
    }
}
