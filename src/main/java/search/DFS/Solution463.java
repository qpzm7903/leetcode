package search.DFS;

/**
 * @author qpzm7903
 * @since 2020-03-15-16:19
 */

public class Solution463 {
    private int perimeter = 0;


    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    help(grid, i, j);
                    break;
                }
            }
            if (perimeter != 0) {
                break;
            }
        }
        return perimeter;
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
        calculatePerimeter(grid, i, j);
        grid[i][j] = 2;

        help(grid, i + 1, j);
        help(grid, i - 1, j);
        help(grid, i, j + 1);
        help(grid, i, j - 1);
    }

    public void calculatePerimeter(int[][] grid, int i, int j) {

        if (i + 1 == grid.length) {
            perimeter += 1;
        } else if (grid[i + 1][j] == 0) {
            perimeter += 1;
        }

        if (i - 1 == -1) {
            perimeter += 1;
        } else if (grid[i - 1][j] == 0) {
            perimeter += 1;
        }
        if (j + 1 == grid[0].length) {
            perimeter += 1;
        } else if (grid[i][j + 1] == 0) {
            perimeter += 1;
        }

        if (j - 1 == -1) {
            perimeter += 1;
        } else if (grid[i][j - 1] == 0) {
            perimeter += 1;
        }
    }
}
