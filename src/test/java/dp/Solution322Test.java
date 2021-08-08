package dp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution322Test {

    @Test
    public void test() {
        int[] coins = {2};
        int amount = 3;
        Assertions.assertEquals(new Solution322().coinChange(coins, amount), -1);
    }

    @Test
    public void test_case2() {

        int[] coins = {1, 2, 5};
        int amount = 11;
        Assertions.assertEquals(new Solution322().coinChange(coins, amount), 3);
    }

}