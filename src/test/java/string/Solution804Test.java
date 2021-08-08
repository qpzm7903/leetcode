package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution804Test {

    @Test
    public void test() {
        String[] input = {"gin", "zen", "gig", "msg"};

        Assertions.assertEquals(new Solution804().uniqueMorseRepresentations(input), 2);

    }

}