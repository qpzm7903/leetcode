package pointer.doublePointer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution997Test {
    @Test
    public void test_case1() {
        Assertions.assertEquals(new Solution997().sortedSquares(new int[]{-4, -1, 0, 3, 10}), new int[]{0, 1, 9, 16, 100});
        Assertions.assertEquals(new Solution997().sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
    }

}