package search.DFS;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution463Test {

    @Test
    public void testCase1() {
        int[][] input = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        Assertions.assertEquals(new Solution463().islandPerimeter(input), 16);
    }

}