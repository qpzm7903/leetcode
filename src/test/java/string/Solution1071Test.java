package string;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1071Test {

    @Test
    public void test_case1() {
        String str1 = "ABCABC", str2 = "ABC";
        assertThat(new Solution1071().gcdOfStrings(str1, str2)).isEqualTo("ABC");
    }

    @Test
    public void test_case2() {
        String str1 = "ABABAB", str2 = "ABAB";
        assertThat(new Solution1071().gcdOfStrings(str1, str2)).isEqualTo("AB");
    }
   @Test
    public void test_case3() {
        String str1 = "LEET", str2 = "CODE";
        assertThat(new Solution1071().gcdOfStrings(str1, str2)).isEqualTo("");
    }

}