package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution8Test {
    @Test
    public void test() {
        String input = "42";
        Assertions.assertEquals(new Solution8().myAtoi(input), 42);
    }

    @Test
    public void test2() {
        String input = "-42";
        Assertions.assertEquals(new Solution8().myAtoi(input), -42);
    }

    @Test
    public void test3() {
        String input = "-42";
        Assertions.assertEquals(new Solution8().myAtoi(input), -42);
    }

}