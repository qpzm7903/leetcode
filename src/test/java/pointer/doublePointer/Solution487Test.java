package pointer.doublePointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution487Test {
    @Test
    public void test_() {
        Assertions.assertEquals(new Solution487().findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0}), 4);
    }

    @Test
    public void test_1() {
        Assertions.assertEquals(new Solution487().findMaxConsecutiveOnes(new int[]{0}), 1);
    }

}