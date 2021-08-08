package bitCalculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class Solution78Test {

    Solution78 solution78 = new Solution78();

    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution78.subsets(nums);
        String actual = result.toString();
        String expected = "[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]";
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void test_not_sorted() {
        int[] nums = {3, 2, 4, 1};
        String expected = "[[], [3], [2], [2, 3], [4], [3, 4], [2, 4], [2, 3, 4], [1], [1, 3], [1, 2], [1, 2, 3], [1, 4], [1, 3, 4], [1, 2, 4], [1, 2, 3, 4]]";
        List<List<Integer>> result = solution78.subsets(nums);
        Assertions.assertEquals(result.size(), (int) Math.pow(2, nums.length));
        String actual = result.toString();
        Assertions.assertEquals(actual, expected);

    }
}