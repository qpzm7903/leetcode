package backTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-01-9:05
 */

public class Solution51 {
    List<List<String>> res = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        int[] queue = new int[n];
        boolean[] usedColumn = new boolean[n];
        dfs(queue, 0, usedColumn);
        return res;
    }

    private void dfs(int[] queue, int currRow, boolean[] usedColumn) {

        if (currRow == queue.length) {
            // collect result
            List<String> oneRes = new LinkedList<>();
            for (int column : queue) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < column; i++) {
                    stringBuilder.append(".");
                }
                stringBuilder.append("Q");
                for (int i = column + 1; i < queue.length; i++) {
                    stringBuilder.append(".");
                }
                oneRes.add(stringBuilder.toString());
            }
            res.add(oneRes);
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
