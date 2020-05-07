package backTracking;

/**
 * @author qpzm7903
 * @since 2020-05-02-16:02
 */

public class Solution62 {
    int count = 0;

    public int uniquePaths(int m, int n) {
        dfs(m, n, 0, 0);
        return count;
    }

    private void dfs(int m, int n, int currRow, int currColumn) {
        if (currRow == m - 1 && currColumn == n - 1) {
            count++;
            return;
        }
        if (currRow >= m || currColumn >= n) return;
        dfs(m, n, currRow + 1, currColumn);
        dfs(m, n, currRow, currColumn + 1);
    }
}
