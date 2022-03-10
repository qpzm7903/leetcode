package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {


    @Test
    void test() {
        int[] inputs = {35, 31, 33, 36, 34};
        int[] except = {3,1,1,0,0};
        Assertions.assertArrayEquals(except, Temperatures.display(inputs));
    }

}