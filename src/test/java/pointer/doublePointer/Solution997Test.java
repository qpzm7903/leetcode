package pointer.doublePointer;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution997Test {
    @Test
    public void test_case1() {
        assertThat(new Solution997().sortedSquares(new int[]{-4, -1, 0, 3, 10})).isEqualTo(new int[]{0, 1, 9, 16, 100});
        assertThat(new Solution997().sortedSquares(new int[]{-7, -3, 2, 3, 11})).isEqualTo(new int[]{4, 9, 9, 49, 121});
    }

}