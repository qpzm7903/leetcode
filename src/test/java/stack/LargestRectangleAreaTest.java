package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleAreaTest {

    @Test
    void test() {
        int[] heights = {3, 2, 5, 4, 6, 1, 4, 2};
        int maxArea = LargestRectangleArea.largestRectangleArea(heights);
        int excepted = 12;
        Assertions.assertEquals(excepted, maxArea);
    }

}