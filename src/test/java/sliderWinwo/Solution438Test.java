package sliderWinwo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class Solution438Test {

    @Test
    public void test_case1() {
        List<Integer> res = new LinkedList<>();
        res.add(0);
        res.add(6);
        Assertions.assertEquals(new Solution438().findAnagrams("cbaebabacd", "abc"), res);
    }

    @Test
    public void test_case2() {
        List<Integer> res = new LinkedList<>();
        res.add(1);
        Assertions.assertEquals(new Solution438().findAnagrams("baa", "aa"), res);
    }

}