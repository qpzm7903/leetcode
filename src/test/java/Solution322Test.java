import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution322Test {

    @Test
    public void coinChange() {
        int[] coins = {1,2,5};
        int amount = 11;
        Solution322 solution322 = new Solution322();
        Assertions.assertEquals(solution322.coinChange(coins, amount), 3);
    }
    @Test
    public void coinChange_2() {
        int[] coins = {2};
        int amount = 3;
        Solution322 solution322 = new Solution322();
        Assertions.assertEquals(solution322.coinChange(coins, amount), -1);
    }
    @Test
    public void coinChange_3() {
        int[] coins = {186,419,83,408};
        int amount = 6249;
        Solution322 solution322 = new Solution322();
        Assertions.assertEquals(solution322.coinChange(coins, amount), 20);
    }
}