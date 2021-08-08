package pointer.doublePointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution42Test {

    @Test
    public void test() {
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(new Solution42().trap(input), 6);

    }
}