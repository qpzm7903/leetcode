package dp;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution322Test {

    @Test
    public void test() {
        int[] coins = {2};
        int amount = 3;
        assertThat(new Solution322().coinChange(coins, amount)).isEqualTo(-1);
    }

    @Test
    public void test_case2() {

        int[] coins = {1, 2, 5};
        int amount = 11;
        assertThat(new Solution322().coinChange(coins, amount)).isEqualTo(3);
    }

}