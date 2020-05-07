package dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DP338Test {

    DP338 dp338 = new DP338();

    @Test
    public void should_return_0_1_1() {
        int[] expected = {0, 1, 1};
        int[] actually = dp338.countBits(2);
        assertThat(actually).isEqualTo(expected);
    }


}