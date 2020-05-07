package string;

/**
 * @author qpzm7903
 * @since 2019-12-20-23:31
 */

public class Solution1221 {
    public int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countL == countR) {
                result += 1;
            }
        }
        return result;
    }
}
