package binarSearch;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2021-10-10-20:30
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * ((long) mid + 1) <= 2 * (long) n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
