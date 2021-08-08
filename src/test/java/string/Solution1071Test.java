package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1071Test {

    @Test
    public void test_case1() {
        String str1 = "ABCABC", str2 = "ABC";
        Assertions.assertEquals(new Solution1071().gcdOfStrings(str1, str2), "ABC");
    }

    @Test
    public void test_case2() {
        String str1 = "ABABAB", str2 = "ABAB";
        Assertions.assertEquals(new Solution1071().gcdOfStrings(str1, str2), "AB");
    }
   @Test
    public void test_case3() {
        String str1 = "LEET", str2 = "CODE";
       Assertions.assertEquals(new Solution1071().gcdOfStrings(str1, str2), "");
    }

}