package string;

/**
 * @author qpzm7903
 * @since 2020-01-12-21:48
 */

public class Solution1309 {
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder(s.length());
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                int val = Integer.valueOf(s.substring(i - 2, i));
                result.append(convert(val));
                i-=2;
            } else {
                int val = Integer.valueOf(chars[i] - '0');
                result.append(convert(val));
            }
        }
        return result.reverse().toString();
    }

    static String convert(int i) {
        return String.valueOf((char)('a' + i - 1));
    }
}
