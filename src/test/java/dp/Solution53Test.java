package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-24-8:15
 */
class Solution53Test {

    @Test
    public void test_case1() {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, new Solution53().maxSubArray(nums));
    }

    @Test
    public void test_case2() {

        int[] nums = {1};
        Assertions.assertEquals(1, new Solution53().maxSubArray(nums));
    }

}