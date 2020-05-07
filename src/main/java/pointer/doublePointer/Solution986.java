package pointer.doublePointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-26-20:38
 */

public class Solution986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            int left = Math.max(A[i][0], B[j][0]);
            int right = Math.min(A[i][1], B[j][1]);
            if (left <= right) {
                res.add(new int[]{left, right});
            }
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
