package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-25-18:27
 */

public class Solution997 {
public int[] sortedSquares(int[] A) {
    int[] res = new int[A.length];
    int left = 0;
    int right = res.length-1;
    int index = res.length-1;
    while (left <= right) {
        if (Math.abs(A[left]) > Math.abs(A[right])) {
            res[index--] = A[left] * A[left];
            left++;
        } else {
            res[index--] = A[right] * A[right];
            right--;
        }
    }
    return res;
}
}
