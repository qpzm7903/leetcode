package string;

/**
 * @author qpzm7903
 * @since 2019-12-20-23:42
 */

public class Solution709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] -= ('A' - 'a');
            }
        }
        return String.valueOf(chars);
    }
}
