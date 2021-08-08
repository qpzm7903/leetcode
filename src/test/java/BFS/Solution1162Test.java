package BFS;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1162Test {
    @Test
    public void test() {
        int[][] gird = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        Assertions.assertEquals(new Solution1162().maxDistance(gird), 2);
    }
}