package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qpzm7903
 * @since 2020-03-13-7:40
 */

public class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max_value = Integer.MIN_VALUE;
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max_value) {
                max_value = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;

    }
}
