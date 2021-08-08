package dp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution887Test {

    @Test
    public void test_case1() {
        Assertions.assertEquals(new Solution887().superEggDrop(1, 2), 2);
    }

    @Test
    public void test_case2() {
        Assertions.assertEquals(new Solution887().superEggDrop(2, 6), 3);

    }

    @Test
    public void test_case3() {
        Assertions.assertEquals(new Solution887().superEggDrop(3, 14), 4);

    }

    @Test
    public void test_case4() {
        Assertions.assertEquals(new Solution887().superEggDrop(7, 10000), 15);
    }
}