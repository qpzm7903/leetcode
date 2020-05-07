package backTracking;

import java.util.Arrays;
import java.util.Queue;

/**
 * n皇后
 *
 * @author qpzm7903
 * @since 2020-03-08-10:27
 */

public class Queen {
    int[] result;
    int n;

    public Queen(int n) {
        result = new int[n];
        this.n = n;
    }

    public void calQueen(int row) {
        if (n == row) {
            printQueen(result);
            return;
        }

        for (int column = 0; column < n; column++) {
            if (isOk(row, column)) {
                result[row] = column;
                calQueen(row + 1);
            }
        }
    }

    private void printQueen(int[] result) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (result[row] == column) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    private boolean isOk(int currentRow, int currentColumn) {
        int leftUpColumn = currentColumn - 1;
        int rightUpColumn = currentColumn + 1;
        for (int row = currentRow - 1; row >= 0; row--) {
            if (result[row] == currentColumn) return false;
            if (leftUpColumn >= 0) {
                if (result[row] == leftUpColumn) {
                    return false;
                }
            }
            if (rightUpColumn < n) {
                if (result[row] == rightUpColumn) {
                    return false;
                }
            }
            leftUpColumn--;
            rightUpColumn++;
        }
        return true;
    }


}

