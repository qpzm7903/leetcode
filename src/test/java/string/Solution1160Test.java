package string;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1160Test {
    @Test
    public void test_case1() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        assertThat(new Solution1160().countCharacters(words, chars)).isEqualTo(6);
    }

    @Test
    public void test_case2() {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        assertThat(new Solution1160().countCharacters(words, chars)).isEqualTo(10);
    }

}