package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution1716Test {

    @Test
    public void test_case1() {
        int[] inputs = {1, 2, 3, 1};
        Assertions.assertEquals(new Solution1716().massage(inputs), 4);
    }

    @Test
    public void test_case2() {
        int[] inputs = {2, 7, 9, 3, 1};
        Assertions.assertEquals(new Solution1716().massage(inputs), 12);

    }

    @Test
    public void test_case3() {
        int[] inputs = {2, 1, 4, 5, 3, 1, 1, 3};
        Assertions.assertEquals(new Solution1716().massage(inputs), 12);

    }

}