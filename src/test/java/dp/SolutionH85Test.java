package dp;

import org.junit.Test;

public class SolutionH85Test {
    @Test
    public void test_case1() {
        char[][] matrix = {{'0', '0', '0', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '1', '0', '0'},
                {'0', '1', '1', '1', '1', '1', '0'}};
        SolutionH85 solutionH85 = new SolutionH85();
        int i = solutionH85.maximalRectangle(matrix);
        System.out.println(i);
    }

    @Test
    public void test_case2() {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        SolutionH85 solutionH85 = new SolutionH85();
        int i = solutionH85.maximalRectangle(matrix);
        System.out.println(i);
    }

}