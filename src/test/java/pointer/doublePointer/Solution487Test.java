package pointer.doublePointer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution487Test {
    @Test
    public void test_() {
        assertThat(new Solution487().findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0})).isEqualTo(4);
    }

    @Test
    public void test_1() {
        assertThat(new Solution487().findMaxConsecutiveOnes(new int[]{0})).isEqualTo(1);
    }

}