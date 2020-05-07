package string;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution151Test {

    @Test
    public void testCase1() {
        String input = "the sky is blue";
        assertThat(new Solution151().reverseWords(input)).isEqualTo("blue is sky the");
    }

    @Test
    public void testCase2() {
        String input = "  hello world!  ";
        assertThat(new Solution151().reverseWords(input)).isEqualTo("world! hello");
    }

    @Test
    public void testCase3() {
        String input = "a good   example";
        assertThat(new Solution151().reverseWords(input)).isEqualTo("example good a");
    }
}