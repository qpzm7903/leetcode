package dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution72Test {
    @Test
    public void test_() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("horse", "ros");
        assertThat(minDistance).isEqualTo(3);
    }

    @Test
    public void test_1() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("", "a");
        assertThat(minDistance).isEqualTo(1);
    }

    @Test
    public void test_2() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("distance", "springbok");
        assertThat(minDistance).isEqualTo(9);
    }

}