package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-19-21:36
 */
class Solution198Test {

    @Test
    public void test() {
        int[] input = {1,2,3,1};
        Assertions.assertEquals(4, new Solution198().rob(input));
        Assertions.assertEquals(4, new Solution198().robWithMemory(input));
    }


    @Test
    public void test_case_2() {
        int[] input = {2,7,9,3,1};
        Assertions.assertEquals(12, new Solution198().rob(input));
        Assertions.assertEquals(12, new Solution198().robWithMemory(input));
    }
}