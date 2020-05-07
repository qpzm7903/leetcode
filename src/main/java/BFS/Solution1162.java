package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-03-29-19:29
 */

public class Solution1162 {
    private int maxDistance = -1;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    private int[][] visited;

    public int maxDistance(int[][] grid) {
        visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    maxDistance = Math.max(maxDistance, help(grid, i, j));
                }
            }
        }
        return maxDistance;
    }

    private int help(int[][] grid, int i, int j) {
        Queue<Step> queue = new LinkedList<>();
        initial(visited);
        queue.add(new Step(i, j, 0));
        visited[i][j] = 1;
        while (!queue.isEmpty()) {
            Step step = queue.remove();
            for (int k = 0; k < 4; k++) {
                int nextX = step.x + dx[k];
                int nextY = step.y + dy[k];
                if (notBoundary(nextX, nextY, grid)) {
                    if (visited[nextX][nextY] == 0) {
                        queue.add(new Step(nextX, nextY, step.step + 1));
                        visited[nextX][nextY] = 1;

                        if (grid[nextX][nextY] == 1) {
                            return step.step + 1;
                        }
                    }

                }
            }
        }
        return -1;

    }

    private boolean notBoundary(int nextX, int nextY, int[][] grid) {
        if (nextX < 0 || nextY <0) {
            return false;
        }
        if (nextX >= grid.length || nextY >= grid[0].length) {
            return false;
        }
        return true;
    }

    private void initial(int[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j] = 0;
            }
        }
    }

    static class Step {
        int x;
        int y;
        int step;

        public Step(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
}
