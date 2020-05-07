package string;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution0106Test {

    @Test
    public void test_case1() {
        String input = "aabcccccaaa";
        assertThat(new Solution0106().compressString(input)).isEqualTo("a2b1c5a3");
    }
    @Test
    public void test_case2() {
        String input = "abbccd";
        assertThat(new Solution0106().compressString(input)).isEqualTo("abbccd");
    }

}