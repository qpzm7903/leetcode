package search.DFS;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution463Test {

    @Test
    public void testCase1() {
        int[][] input = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        assertThat(new Solution463().islandPerimeter(input)).isEqualTo(16);
    }

}