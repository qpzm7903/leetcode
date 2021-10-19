package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-19-22:09
 */
class Solution213Test {

    @Test
    void test_case_1() {
        int[] input = {2, 3, 2};
        Assertions.assertEquals(3, new Solution213().rob(input));
    }

    @Test
    void test_case_2() {
        int[] input = {1, 2, 3, 1};
        Assertions.assertEquals(4, new Solution213().rob(input));
    }

    @Test
    void test_case_3() {
        int[] input = {0};
        Assertions.assertEquals(0, new Solution213().rob(input));
    }

    @Test
    void test_case_() {
        int[] input = {200, 3, 140, 20, 10};
        Assertions.assertEquals(340, new Solution213().rob(input));
    }

}