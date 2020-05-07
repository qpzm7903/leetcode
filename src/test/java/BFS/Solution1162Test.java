package BFS;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1162Test {
    @Test
    public void test() {
        int[][] gird = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        assertThat(new Solution1162().maxDistance(gird)).isEqualTo(2);
    }
}