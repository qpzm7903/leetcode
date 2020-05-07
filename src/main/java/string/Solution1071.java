package string;

/**
 * @author qpzm7903
 * @since 2020-03-12-7:22
 */

public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        String temp;
        if (str1.length() < str2.length()) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String res = "";
        for (int i = 0; i < str2.length(); i++) {
            temp = str2.substring(0, i + 1);
            if (gcd(str1, temp) && gcd(str2, temp)) {
                res = temp;
            }
        }
        return res;
    }

    public boolean gcd(String s, String subString) {
        for (int i = 0; i < s.length(); ) {
            if (i + subString.length() > s.length()) {
                return false;
            }
            String subS = s.substring(i, i + subString.length());
            if (!subS.equals(subString)) {
                return false;
            }
            i += subString.length();
        }
        return true;
    }

}
