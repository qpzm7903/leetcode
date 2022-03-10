package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Coin1Test {

    @Test
    void test() {
        int[] inputs = {3, 2, 1, 3, 0, 2};
        System.out.println(Coin1.changeCoin(620, inputs));
    }

}