package sliderWinwo;


import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution438Test {

    @Test
    public void test_case1() {
        List<Integer> res = new LinkedList<>();
        res.add(0);
        res.add(6);
        assertThat(new Solution438().findAnagrams("cbaebabacd", "abc")).isEqualTo(res);
    }

    @Test
    public void test_case2() {
        List<Integer> res = new LinkedList<>();
        res.add(1);
        assertThat(new Solution438().findAnagrams("baa", "aa")).isEqualTo(res);
    }

}