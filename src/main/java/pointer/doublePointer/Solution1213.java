package pointer.doublePointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author qpzm7903
 * @since 2020-04-25-15:54
 */

public class Solution1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new LinkedList<>();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = arr3.length;
        int val1;
        int val2;
        int val3;
        int min;
        while (p1 < length1 && p2 < length2 && p3 < length3) {
            val1 = arr1[p1];
            val2 = arr2[p2];
            val3 = arr3[p3];
            if (val1 == val2 && val2 == val3) {
                p1++;
                p2++;
                p3++;
                res.add(val1);
                continue;
            }
            min = Math.min(Math.min(val1, val2), val3);

            if (min == val1) {
                p1++;
            }
            if (min == val2) {
                p2++;
            }
            if (min == val3) {
                p3++;
            }
        }
        return res;
    }
}
