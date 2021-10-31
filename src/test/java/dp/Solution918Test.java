package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-31-10:33
 */
class Solution918Test {


    @Test
    void test() {
        int[] ints = {1, -2, 3, -2};
        Assertions.assertEquals(3, new Solution918().maxSubarraySumCircular(ints));
    }

    @Test
    void test_2() {
        int[] ints = {5, -3, 5};
        Assertions.assertEquals(10, new Solution918().maxSubarraySumCircular(ints));
    }

    @Test
    void test_3() {
        int[] ints = {3, -1, 2, -1};
        Assertions.assertEquals(4, new Solution918().maxSubarraySumCircular(ints));
    }

    @Test
    void test_4() {
        int[] ints = {3, -2, 2, -3};
        Assertions.assertEquals(3, new Solution918().maxSubarraySumCircular(ints));
    }

    @Test
    void test_5() {
        int[] ints = {-2, -3, -1};
        Assertions.assertEquals(-1, new Solution918().maxSubarraySumCircular(ints));
    }

}