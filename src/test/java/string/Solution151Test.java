package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution151Test {

    @Test
    public void testCase1() {
        String input = "the sky is blue";
        Assertions.assertEquals(new Solution151().reverseWords(input), "blue is sky the");
    }

    @Test
    public void testCase2() {
        String input = "  hello world!  ";
        Assertions.assertEquals(new Solution151().reverseWords(input), "world! hello");
    }

    @Test
    public void testCase3() {
        String input = "a good   example";
        Assertions.assertEquals(new Solution151().reverseWords(input), "example good a");
    }
}