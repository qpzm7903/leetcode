package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1160Test {
    @Test
    public void test_case1() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        Assertions.assertEquals(new Solution1160().countCharacters(words, chars), 6);
    }

    @Test
    public void test_case2() {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        Assertions.assertEquals(new Solution1160().countCharacters(words, chars), 10);
    }

}