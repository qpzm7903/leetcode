package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution0106Test {

    @Test
    public void test_case1() {
        String input = "aabcccccaaa";
        Assertions.assertEquals(new Solution0106().compressString(input), "a2b1c5a3");
    }
    @Test
    public void test_case2() {
        String input = "abbccd";
        Assertions.assertEquals(new Solution0106().compressString(input), "abbccd");
    }

}