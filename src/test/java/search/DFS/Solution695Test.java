package search.DFS;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(new Solution695().maxAreaOfIsland(grid)).isEqualTo(6);

    }

    @Test
    public void testCase2() {
        int[][] grid =
                {{0, 0, 0, 0, 0, 0, 0, 0}};
        assertThat(new Solution695().maxAreaOfIsland(grid)).isEqualTo(0);

    }

}