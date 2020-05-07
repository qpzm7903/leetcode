package backTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-02-10:11
 */

public class Solution52 {
    int res = 0;
    public int totalNQueens(int n) {
        int[] queue = new int[n];
        boolean[] usedColumn = new boolean[n];
        dfs(queue, 0, usedColumn);
        return res;
    }
    private void dfs(int[] queue, int currRow, boolean[] usedColumn) {

        if (currRow == queue.length) {
            // collect result
            res++;
            return;

        }
        for (int column = 0; column < queue.length; column++) {
            // 如果之前使用了 i 就不要用
            if (usedColumn[column]) continue;

            // 判断当前的i
            if (conflict(currRow, column, queue)) {
                continue;
            }

            // used
            queue[currRow] = column;
            usedColumn[column] = true;
            dfs(queue, currRow + 1, usedColumn);
            usedColumn[column] = false;
        }
    }

    private boolean conflict(int row, int column, int[] queue) {
        for (int i = 0; i < row; i++) {
            // 上
            if (queue[i] == column) {
                return true;
            }
            // 左上
            if (queue[i] == column - (row - i)) {
                return true;
            }
            // 右上
            if (queue[i] == column + (row - i)) {
                return true;
            }
        }

        return false;
    }
}
