package string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution804Test {

    @Test
    public void test() {
        String[] input = {"gin", "zen", "gig", "msg"};

        assertThat(new Solution804().uniqueMorseRepresentations(input)).isEqualTo(2);

    }

}