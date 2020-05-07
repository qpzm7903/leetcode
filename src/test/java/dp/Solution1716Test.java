package dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution1716Test {

    @Test
    public void test_case1() {
        int[] inputs = {1, 2, 3, 1};
        assertThat(new Solution1716().massage(inputs)).isEqualTo(4);
    }

    @Test
    public void test_case2() {
        int[] inputs = {2, 7, 9, 3, 1};
        assertThat(new Solution1716().massage(inputs)).isEqualTo(12);

    }

    @Test
    public void test_case3() {
        int[] inputs = {2, 1, 4, 5, 3, 1, 1, 3};
        assertThat(new Solution1716().massage(inputs)).isEqualTo(12);

    }

}