package dp;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.junit.Assert.*;

public class Dp1025Test {

    private Dp1025 dp338;

    @Before
    public void initClass() {
        dp338 = new Dp1025();
    }
    @Test
    public void divisorGame() {

    }

    @Test
    public void should_return_true_when_n_is_2() {
        assertThat(dp338.divisorGame(2)).isTrue();
    }
}