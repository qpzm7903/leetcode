package backTracking;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointToOffer13Test {

    @Test
    public void testCase1() {
        assertThat(new PointToOffer13().movingCount(2, 3, 1)).isEqualTo(3);
        assertThat(new PointToOffer13().movingCount(3, 1, 0)).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new PointToOffer13().movingCount(1, 2, 1)).isEqualTo(2);


    }
}