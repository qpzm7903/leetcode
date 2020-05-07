package sliderWinwo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-25-8:28
 */

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        int left = 0;
        int right = 0;
        int valid = 0;
        char[] chars = p.toCharArray();
        for (char aChar : chars) {
            need.put(aChar, need.getOrDefault(aChar, 0) + 1);
        }
        chars = s.toCharArray();
        while (right < s.length()) {
            char aChar = chars[right];
            right++;
            window.put(aChar, window.getOrDefault(aChar, 0) + 1);
            if (window.get(aChar).equals(need.get(aChar))) {
                valid++;
            }
            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    res.add(left);
                }
                char removeChar = chars[left];
                left++;
                if (window.get(removeChar).equals(need.get(removeChar))) {
                    valid--;
                }
                window.put(removeChar, window.get(removeChar) - 1);
            }
        }
        return res;
    }

}
