import java.util.HashMap;
import java.util.Map;

/**
 * @author qpzm7903
 * @since 2020-03-19-22:45
 */

public class Solution409 {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        int count = 0;
        boolean odd = false;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                count += entry.getValue();
            } else {
                count = count +entry.getValue()- 1;
                odd = true;
            }
        }
        if (odd) {
            count += 1;
        }
        return count;
    }
}
