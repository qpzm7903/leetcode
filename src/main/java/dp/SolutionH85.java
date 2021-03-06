package dp;

import java.util.Arrays;

/**
 * @author qpzm7903
 * @since 2020-05-17-16:33
 */

public class SolutionH85 {
    public int maximalRectangle(char[][] matrix) {
        printMatrix(matrix);
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[] left = new int[n]; // initialize left as the leftmost boundary possible
        int[] right = new int[n];
        int[] height = new int[n];

        Arrays.fill(right, n); // initialize right as the rightmost boundary possible

        int maxarea = 0;
        for (int i = 0; i < m; i++) {
            int cur_left = 0, cur_right = n;
            // update height
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') height[j]++;
                else height[j] = 0;
            }
            // update left
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') left[j] = Math.max(left[j], cur_left);
                else {
                    // curr_left 可以称为 最后一次0出现的右边
                    left[j] = 0;
                    cur_left = j + 1;
                }
            }
            // update right
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') right[j] = Math.min(right[j], cur_right);
                else {
                    right[j] = n;
                    cur_right = j;
                }
            }
            print(left, right, height);
            // update area
            for (int j = 0; j < n; j++) {
                maxarea = Math.max(maxarea, (right[j] - left[j]) * height[j]);
            }
        }
        return maxarea;
    }

    private void printMatrix(char[][] matrix) {
        System.out.println("matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    private void print(int[] left, int[] right, int[] height) {
        System.out.println("-----------------------");
        System.out.println("height");
        for (int i : height) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("left");
        for (int i : left) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("right");
        for (int i : right) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

