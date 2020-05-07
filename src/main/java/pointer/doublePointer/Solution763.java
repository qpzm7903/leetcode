package pointer.doublePointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author qpzm7903
 * @since 2020-04-25-18:19
 */

public class Solution763 {
    public List<Integer> partitionLabels(String S) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        List<Integer> res = new LinkedList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            right = Math.max(right, map.get(chars[i]));
            if (i == right) {
                res.add(right - left + 1);
                left = i + 1;
            }
        }
        return res;
    }

}
