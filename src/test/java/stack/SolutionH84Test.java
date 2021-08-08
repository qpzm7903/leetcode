package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolutionH84Test {
    @Test
    public void test_case1() {
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByForce(new int[]{2, 1, 5, 6, 2, 3}), 10);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByForceAndOptimization(new int[]{2, 1, 5, 6, 2, 3}), 10);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByDivideConquer(new int[]{2, 1, 5, 6, 2, 3}), 10);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByStack(new int[]{2, 1, 5, 6, 2, 3}), 10);
    }

    @Test
    public void test_case2() {
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByForce(new int[]{1}), 1);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByForceAndOptimization(new int[]{1}), 1);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByDivideConquer(new int[]{1}), 1);
        Assertions.assertEquals(new SolutionH84().largestRectangleAreaByStack(new int[]{1}), 1);
    }

}