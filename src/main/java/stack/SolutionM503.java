package stack;

import java.util.Stack;

/**
 * @author qpzm7903
 * @since 2020-05-16-16:14
 */

public class SolutionM503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int length = nums.length;
        int[] res = new int[length];
        for (int i = length * 2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i % length] >= stack.peek()) {
                stack.pop();
            }
            res[i % length] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % length]);
        }
        return res;
    }

}
