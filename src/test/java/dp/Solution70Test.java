package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-18-7:31
 */
class Solution70Test {

    @Test
    void test() {
        Assertions.assertEquals(new Solution70().climbStairs(2), 2);
        Assertions.assertEquals(new Solution70().climbStairs(3), 3);
        Assertions.assertEquals(new Solution70().climbStairsWithIter(2), 2);
        Assertions.assertEquals(new Solution70().climbStairsWithIter(3), 3);

    }
}