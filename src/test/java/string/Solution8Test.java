package string;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution8Test {
    @Test
    public void test() {
        String input = "42";
        assertThat(new Solution8().myAtoi(input)).isEqualTo(42);
    }

    @Test
    public void test2() {
        String input = "-42";
        assertThat(new Solution8().myAtoi(input)).isEqualTo(-42);
    }

    @Test
    public void test3() {
        String input = "-42";
        assertThat(new Solution8().myAtoi(input)).isEqualTo(-42);
    }

}