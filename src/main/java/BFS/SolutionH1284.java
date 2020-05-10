package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author qpzm7903
 * @since 2020-05-10-15:10
 */

public class SolutionH1284 {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {0, 0}};

    int encode(int[][] mat) {
        int x = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                x = x*2 + mat[i][j];
            }
        }
        return x;
    }

    int[][] decode(int x, int m, int n) {
        int[][] mat = new int[m][n];
        for (int i = m-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--) {
                mat[i][j] = x&1;
                x >>= 1;
            }
        }
        return mat;
    }

    void flip(int[][] mat, int i,int j) {
        int m = mat.length;
        int n = mat[0].length;
        for (int[] direction : directions) {
            int i0 = i + direction[0];
            int j0 = j + direction[1];
            if (i0 >= 0 && i0 < m && j0 >= 0 && j0 < n) {
                mat[i0][j0] ^= 1;
            }
        }
    }
    public int minFlips(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int start = encode(mat);
        if (start == 0) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        int step = 0;
        System.out.println("into while");
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                Integer curr_x = queue.poll();
                int[][] curr_mat = decode(curr_x, m, n);
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        flip(curr_mat,i,j);
                        int new_x = encode(curr_mat);
                        if (new_x == 0) {
                            return step;
                        }
                        if (!visited.contains(new_x)) {
                            visited.add(new_x);
                            queue.add(new_x);
                        }
                        flip(curr_mat, i, j);
                    }
                }
            }
        }
        System.out.println("in the end");
        return 0;
    }
}
