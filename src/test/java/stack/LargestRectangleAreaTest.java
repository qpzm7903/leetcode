package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestRectangleAreaTest {

    @Test
    void test() {
        int[] heights = {3, 2, 5, 4, 6, 1, 4, 2};
        int maxArea = LargestRectangleArea.largestRectangleArea(heights);
        int excepted = 12;
        Assertions.assertEquals(excepted, maxArea);
    }

    @Test
    void test_2() {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'0', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {
                '1', '0', '0', '1', '0'
        }};
        int maxArea = LargestRectangleArea.maximalRectangle(matrix);
        int excepted = 6;
        Assertions.assertEquals(excepted, maxArea);
    }

}