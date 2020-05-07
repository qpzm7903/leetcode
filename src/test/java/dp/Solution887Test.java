package dp;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution887Test {

    @Test
    public void test_case1() {
        assertThat(new Solution887().superEggDrop(1, 2)).isEqualTo(2);
    }

    @Test
    public void test_case2() {
        assertThat(new Solution887().superEggDrop(2, 6)).isEqualTo(3);

    }

    @Test
    public void test_case3() {
        assertThat(new Solution887().superEggDrop(3, 14)).isEqualTo(4);

    }

    @Test
    public void test_case4() {
        assertThat(new Solution887().superEggDrop(7, 10000)).isEqualTo(15);
    }
}