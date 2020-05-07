package bitCalculate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution78Test {

    Solution78 solution78 = new Solution78();

    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution78.subsets(nums);
        String actual = result.toString();
        String expected = "[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void test_not_sorted() {
        int[] nums = {3, 2, 4, 1};
        String expected = "[[], [3], [2], [2, 3], [4], [3, 4], [2, 4], [2, 3, 4], [1], [1, 3], [1, 2], [1, 2, 3], [1, 4], [1, 3, 4], [1, 2, 4], [1, 2, 3, 4]]";
        List<List<Integer>> result = solution78.subsets(nums);
        assertThat(result.size()).isEqualTo((int)Math.pow(2, nums.length));
        String actual = result.toString();
        assertThat(actual).isEqualTo(expected);

    }
}