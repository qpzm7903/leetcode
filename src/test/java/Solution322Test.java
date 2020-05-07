import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution322Test {

    @Test
    public void coinChange() {
        int[] coins = {1,2,5};
        int amount = 11;
        Solution322 solution322 = new Solution322();
        assertThat(solution322.coinChange(coins, amount)).isEqualTo(3);
    }
    @Test
    public void coinChange_2() {
        int[] coins = {2};
        int amount = 3;
        Solution322 solution322 = new Solution322();
        assertThat(solution322.coinChange(coins, amount)).isEqualTo(-1);
    }
    @Test
    public void coinChange_3() {
        int[] coins = {186,419,83,408};
        int amount = 6249;
        Solution322 solution322 = new Solution322();
        assertThat(solution322.coinChange(coins, amount)).isEqualTo(20);
    }
}