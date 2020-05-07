package pointer.doublePointer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution42Test {

    @Test
    public void test() {
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertThat(new Solution42().trap(input)).isEqualTo(6);

    }
}