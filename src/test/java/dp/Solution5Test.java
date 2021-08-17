package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 最长回文串ut
 *
 * @author qpzm7903
 * @since 2021-08-18-7:46
 */
class Solution5Test {

    @Test
    void test_case_1() {
        String babad = new Solution5.Solution_1().longestPalindrome("babad");
        Assertions.assertEquals("bab", babad);
    }

}