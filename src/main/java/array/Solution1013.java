package array;

/**
 * @author qpzm7903
 * @since 2020-03-11-6:40
 */

public class Solution1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int all_sum = sum_of_i_to_j(A, 0, A.length);
        if (all_sum % 3 != 0) {
            return false;
        }
        return false;

    }

    public int sum_of_i_to_j(int[] array, int i, int j) {
        int res = 0;
        for (; i < j; i++) {
            res += array[i];
        }
        return res;
    }

}
