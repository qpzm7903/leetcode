package search.DFS;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution695Test {

    @Test
    public void testCase1() {
        int[][] grid =
                {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        Assertions.assertEquals(new Solution695().maxAreaOfIsland(grid), 6);

    }

    @Test
    public void testCase2() {
        int[][] grid =
                {{0, 0, 0, 0, 0, 0, 0, 0}};
        Assertions.assertEquals(new Solution695().maxAreaOfIsland(grid), 0);

    }

}