package dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution300Test {
    @Test
    public void test_case1() {
        int[] arrays = {10, 9, 2, 5, 3, 7, 101, 18};
        assertThat(new Solution300().lengthOfLIS(arrays)).isEqualTo(4);
    }

    @Test
    public void test_case2() {
        int[] arrays = {10, 1};
        assertThat(new Solution300().lengthOfLIS(arrays)).isEqualTo(1);
    }

    @Test
    public void test_case3() {
        int[] arrays = {};
        assertThat(new Solution300().lengthOfLIS(arrays)).isEqualTo(0);
    }

    @Test
    public void test_case4() {
        int[] arrays = {10, 9, 2, 5, 3, 4};
        assertThat(new Solution300().lengthOfLIS(arrays)).isEqualTo(3);
    }

}