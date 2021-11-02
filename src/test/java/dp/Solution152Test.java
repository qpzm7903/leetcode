package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-31-21:50
 */
class Solution152Test {

    @Test
    void test() {
        int[] ints = {2, 3, -2, 4};
        Assertions.assertEquals(6, new Solution152().maxProduct(ints));
    }

    @Test
    void test_1() {
        int[] ints = {-2, 0, -1};
        Assertions.assertEquals(0, new Solution152().maxProduct(ints));
    }

}