package binarSearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-10-20:30
 */
class Solution441Test {

    @Test
    void test_when_n_is_5_should_return_2() {
        Assertions.assertEquals(new Solution441().arrangeCoins(5), 2);
    }

    @Test
    void test_when_n_is_8_should_return_3() {
        Assertions.assertEquals(new Solution441().arrangeCoins(8), 3);
    }

    @Test
    void test_when_n_is_3_should_return_1() {
        Assertions.assertEquals(new Solution441().arrangeCoins(3), 2);
    }

    @Test
    void test_when_n_is_1804289383_should_return_60070() {
        Assertions.assertEquals(new Solution441().arrangeCoins(1804289383), 60070);
    }

}