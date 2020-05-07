package sliderWinwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author qpzm7903
 * @since 2020-04-25-9:08
 */

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int l = 0;
        int r = 0;
        int res = 0;
        char[] chars = s.toCharArray();
        while (r < s.length()) {
            char aChar = chars[r];
            window.put(aChar, window.getOrDefault(aChar, 0) + 1);
            r++;
            while (window.get(aChar) > 1) {
                char removeChar = chars[l];
                l++;
                window.put(removeChar, window.get(removeChar) - 1);
            }
            res = Math.max(res, r - l);
        }
        return res;
    }
}
