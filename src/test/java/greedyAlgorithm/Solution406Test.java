package greedyAlgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution406Test {

    @Test
    public void reconstructQueue() {

        int[][] input = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        int[][] result = Solution406.reconstructQueue(input);
        Assertions.assertEquals(result, expected);

    }
}