package string;

/**
 * @author qpzm7903
 * @since 2020-05-16-16:26
 */

public class SolutionM556 {
    public int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int i = chars.length - 2;
        while (i >= 0 && chars[i + 1] <= chars[i]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = chars.length - 1;
        while (j >= 0 && chars[j] <= chars[i]) {
            j--;
        }
        swap(chars, i, j);
        reverse(chars, i + 1);
        try {
            return Integer.parseInt(new String(chars));
        } catch (Exception exception) {
            return -1;
        }
    }

    private void reverse(char[] chars, int i) {
        int j = chars.length - 1;
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
