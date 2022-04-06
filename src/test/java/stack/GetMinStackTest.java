package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMinStackTest {


    @Test
    void test() {
        GetMinStack stack = new GetMinStack();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(3);
        Assertions.assertEquals(1,stack.getMin());
        Assertions.assertEquals(3,stack.pop());
        Assertions.assertEquals(1,stack.pop());

        Assertions.assertEquals(2,stack.getMin());


    }

}