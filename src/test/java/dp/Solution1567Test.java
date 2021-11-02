package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-11-03-7:32
 */
class Solution1567Test {

    @Test
    void test_1() {
        int[] input = {1, -2, -3, 4};
        Assertions.assertEquals(4, new Solution1567().getMaxLen(input));

    }

    @Test
    void test_2() {
        int[] input = {0, 1, -2, -3, -4};
        Assertions.assertEquals(3, new Solution1567().getMaxLen(input));

    }

    @Test
    void test_3() {
        int[] input = {-1, -2, -3, 0, 1};
        Assertions.assertEquals(2, new Solution1567().getMaxLen(input));
    }

    @Test
    void test_4() {
        int[] input = {-1, 2};
        Assertions.assertEquals(1, new Solution1567().getMaxLen(input));
    }

    @Test
    void test_5() {
        int[] input = {1, 2, 3, 5, -6, 4, 0, 10};
        Assertions.assertEquals(4, new Solution1567().getMaxLen(input));
    }


}