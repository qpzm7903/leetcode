package backTracking;

/**
 * @author qpzm7903
 * @since 2020-04-09-8:17
 */

public class PointToOffer13 {
    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];
        return backTracking(visited, 0, 0, k);
    }

    private int backTracking(int[][] visited, int i, int j, int k) {
        if (i < 0 || i >= visited.length || j < 0 || j >= visited[0].length) {
            return 0;
        }
        if (!reachable(i, j, k)) {
            return 0;
        }
        if (visited[i][j] == 1) {
            return 0;
        }
        visited[i][j] = 1;
        return 1 + backTracking(visited, i - 1, j, k)
                + backTracking(visited, i + 1, j, k)
                + backTracking(visited, i, j + 1, k)
                + backTracking(visited, i, j - 1, k);
    }

    private boolean reachable(int i, int j, int k) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j > 0) {
            sum+= j%10;
            j /= 10;
        }
        return sum <= k;
    }
}
