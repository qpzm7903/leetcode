package backTracking;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointToOffer13Test {

    @Test
    public void testCase1() {
        Assertions.assertEquals(new PointToOffer13().movingCount(2, 3, 1), 3);
        Assertions.assertEquals(new PointToOffer13().movingCount(3, 1, 0), 1);
    }

    @Test
    public void testCase2() {
        Assertions.assertEquals(new PointToOffer13().movingCount(1, 2, 1), 2);


    }
}