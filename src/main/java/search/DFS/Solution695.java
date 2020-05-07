package search.DFS;

/**
 * @author qpzm7903
 * @since 2020-03-15-9:25
 */

public class Solution695 {
    private int maxArea = 0;
    private int tempArea = 0;


    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    tempArea = 0;
                    help(grid, i, j);
                }
            }
        }
        return maxArea;
    }

    public void help(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return;
        }
        if (j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] != 1) {
            return;
        }

        grid[i][j] = 2;
        tempArea++;
        maxArea = Math.max(tempArea, maxArea);

        help(grid, i + 1, j);
        help(grid, i - 1, j);
        help(grid, i, j + 1);
        help(grid, i, j - 1);
    }
}
