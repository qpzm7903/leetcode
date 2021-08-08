package BFS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionH1284Test {

    @Test
    public void test_() {
        SolutionH1284 solutionH1284 = new SolutionH1284();
        int minStep = solutionH1284.minFlips(new int[][]{{0, 0}, {0, 1}});
        Assertions.assertEquals(minStep, 3);
    }

}