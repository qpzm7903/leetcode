package string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution820Test {
    @Test
    public void test() {
        String[] input = {"time", "me", "bell"};
        Assertions.assertEquals(new Solution820().minimumLengthEncoding(input), 10);
    }

    @Test
    public void test1() {
        String[] input = {"time", "time", "time", "time"};
        Assertions.assertEquals(new Solution820().minimumLengthEncoding(input), 5);
    }
}