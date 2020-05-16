package stack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionH84Test {
    @Test
    public void test_case1() {
        assertThat(new SolutionH84().largestRectangleAreaByForce(new int[]{2, 1, 5, 6, 2, 3})).isEqualTo(10);
        assertThat(new SolutionH84().largestRectangleAreaByForceAndOptimization(new int[]{2, 1, 5, 6, 2, 3})).isEqualTo(10);
        assertThat(new SolutionH84().largestRectangleAreaByDivideConquer(new int[]{2, 1, 5, 6, 2, 3})).isEqualTo(10);
        assertThat(new SolutionH84().largestRectangleAreaByStack(new int[]{2, 1, 5, 6, 2, 3})).isEqualTo(10);
    }

    @Test
    public void test_case2() {
        assertThat(new SolutionH84().largestRectangleAreaByForce(new int[]{1})).isEqualTo(1);
        assertThat(new SolutionH84().largestRectangleAreaByForceAndOptimization(new int[]{1})).isEqualTo(1);
        assertThat(new SolutionH84().largestRectangleAreaByDivideConquer(new int[]{1})).isEqualTo(1);
        assertThat(new SolutionH84().largestRectangleAreaByStack(new int[]{1})).isEqualTo(1);
    }

}