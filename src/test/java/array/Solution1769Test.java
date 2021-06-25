package array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Solution1769Test {


    @Test
    void test() {
        Solution1769 solution1769 = new Solution1769();
        assertArrayEquals(new int[]{1, 1, 3}, solution1769.minOperations("110"));
    }
}