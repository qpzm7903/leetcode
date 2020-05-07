package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-03-07-8:11
 */

public class Solution59 {

    Queue<Integer> queue;
    int max_val = Integer.MIN_VALUE;
    int prev_max_val = Integer.MIN_VALUE;

    public Solution59() {
        queue = new LinkedList<>();
    }

    public int max_value() {
        if (queue.isEmpty()) {
            return -1;
        }
        return max_val;
    }

    public void push_back(int value) {
        queue.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }

}
