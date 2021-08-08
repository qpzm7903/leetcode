package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DP338Test {

    DP338 dp338 = new DP338();

    @Test
    public void should_return_0_1_1() {
        int[] expected = {0, 1, 1};
        int[] actually = dp338.countBits(2);
        Assertions.assertEquals(actually, expected);
    }


}