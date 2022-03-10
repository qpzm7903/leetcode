package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-03-20-7:58
 */

public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> heap = new PriorityQueue<Integer>(k, (i1, i2) -> (i2 - i1));
        int[] res = new int[k];
        for (int i = 0; i < arr.length; i++) {
            if (heap.size() < k) {
                heap.add(arr[i]);
            } else {
                heap.add(arr[i]);
                heap.remove();
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = heap.remove();
        }
        return res;
    }
}
