package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-25-18:48
 */

public class Solution344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left <= right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }
}
