package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author qpzm7903
 * @since 2020-05-10-16:02
 */

public class SolutionM529 {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, +1}, {+1, -1}, {+1, +1}};

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{click[0], click[1]});
        while (!queue.isEmpty()) {
            Integer[] curr = queue.poll();
            if (board[curr[0]][curr[1]]=='B'){
                continue;
            }
            int count = 0;
            for (int[] direction : directions) {
                int i = curr[0] + direction[0];
                int j = curr[1] + direction[1];
                if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
                    if (board[i][j] == 'M') {
                        count++;
                    }
                }
            }
            if (count == 0) {
                board[curr[0]][curr[1]] = 'B';
                for (int[] direction : directions) {
                    int i = curr[0] + direction[0];
                    int j = curr[1] + direction[1];
                    if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
                        if (board[i][j] == 'E') {
                            queue.add(new Integer[]{i, j});
                        }
                    }
                }
            } else {
                board[curr[0]][curr[1]] = (char) ('0' + count);
            }

        }
        return board;
    }
}
