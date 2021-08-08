package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class Dp1025Test {

    private Dp1025 dp338;

    @BeforeEach
    public void initClass() {
        dp338 = new Dp1025();
    }

    @Test
    public void divisorGame() {

    }

    @Test
    public void should_return_true_when_n_is_2() {
        Assertions.assertTrue(dp338.divisorGame(2));
        Assertions.assertTrue(dp338.divisorGame(2));
    }
}