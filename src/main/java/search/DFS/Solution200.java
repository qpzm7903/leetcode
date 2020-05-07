package search.DFS;

/**
 * @author qpzm7903
 * @since 2020-03-15-10:50
 */

public class Solution200 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int res = 0;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    help(grid, i, j);
                }
            }
        }
        return res;
    }

    public void help(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return;
        }
        if (j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0';

        help(grid, i + 1, j);
        help(grid, i - 1, j);
        help(grid, i, j + 1);
        help(grid, i, j - 1);
    }
}
