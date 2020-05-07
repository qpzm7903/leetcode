package string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author qpzm7903
 * @since 2020-03-17-7:17
 */

public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        if (words == null || words.length == 0) {
            return 0;
        }
        if (chars == null || chars.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = help(chars);
        int count = 0;
        for (String word : words) {
            HashMap<Character, Integer> tempMap = help(word);
            boolean flag = true;
            for (Character c : tempMap.keySet()) {
                if (!hashMap.containsKey(c) ||  !(hashMap.get(c) >= tempMap.get(c))) {
                    flag = false;
                }
            }
            if (flag) {
                count += word.length();
            }
        }
        return count;
    }

    public HashMap<Character, Integer> help(String word) {
        HashMap<Character, Integer> res = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            } else {
                res.put(c, 1);
            }
        }
        return res;
    }
}
