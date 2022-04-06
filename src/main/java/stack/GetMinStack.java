package stack;

import java.util.Objects;
import java.util.Stack;

public class GetMinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;


    public GetMinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public Integer pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        Integer pop = stack.pop();
        if (Objects.equals(pop, getMin())) {
            minStack.pop();
        }

        return pop;

    }

    public void push(Integer integer) {

        stack.push(integer);
        if (minStack.isEmpty()) {
            minStack.push(integer);
        }
        if (integer <= getMin()) {
            minStack.push(integer);
        }
    }

    public Integer getMin() {
        if (minStack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return minStack.peek();
    }
}
