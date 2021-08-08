package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution300Test {
    @Test
    public void test_case1() {
        int[] arrays = {10, 9, 2, 5, 3, 7, 101, 18};
        Assertions.assertEquals(new Solution300().lengthOfLIS(arrays), 4);
    }

    @Test
    public void test_case2() {
        int[] arrays = {10, 1};
        Assertions.assertEquals(new Solution300().lengthOfLIS(arrays), 1);
    }

    @Test
    public void test_case3() {
        int[] arrays = {};
        Assertions.assertEquals(new Solution300().lengthOfLIS(arrays), 0);
    }

    @Test
    public void test_case4() {
        int[] arrays = {10, 9, 2, 5, 3, 4};
        Assertions.assertEquals(new Solution300().lengthOfLIS(arrays), 3);
    }

}