package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution72Test {
    @Test
    public void test_() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("horse", "ros");
        Assertions.assertEquals(minDistance, 3);
    }

    @Test
    public void test_1() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("", "a");
        Assertions.assertEquals(minDistance, 1);
    }

    @Test
    public void test_2() {
        Solution72 solution72 = new Solution72();
        int minDistance = solution72.minDistance("distance", "springbok");
        Assertions.assertEquals(minDistance, 9);
    }

}