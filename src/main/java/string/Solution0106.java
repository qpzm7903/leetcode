package string;

/**
 * @author qpzm7903
 * @since 2020-03-16-20:33
 */

public class Solution0106 {
    public String compressString(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        char pre = S.charAt(0);
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == pre) {
                count++;
            } else {
                stringBuilder.append(pre).append(count);
                pre = S.charAt(i);
                count = 1;
            }
        }
        stringBuilder.append(pre).append(count);
        if (stringBuilder.length() < S.length()) {
            return stringBuilder.toString();
        } else {
            return S;
        }
    }
}
