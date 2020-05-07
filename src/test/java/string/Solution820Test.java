package string;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution820Test {
    @Test
    public void test() {
        String[] input = {"time", "me", "bell"};
        assertThat(new Solution820().minimumLengthEncoding(input)).isEqualTo(10);
    }

    @Test
    public void test1() {
        String[] input = {"time", "time", "time", "time"};
        assertThat(new Solution820().minimumLengthEncoding(input)).isEqualTo(5);
    }
}