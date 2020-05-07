package string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution1221Test {

    @Test
    public void balancedStringSplit() {
        String input = "RLRRLLRLRL";
        Solution1221 solution1221 = new Solution1221();
        assertThat(solution1221.balancedStringSplit(input)).isEqualTo(4);
    }

    @Test
    public void balancedStringSplit2() {
        String input = "RLLLLRRRLR";
        Solution1221 solution1221 = new Solution1221();
        assertThat(solution1221.balancedStringSplit(input)).isEqualTo(3);
    }

    @Test
    public void balancedStringSplit3() {
        String input = "LLLLRRRR";
        Solution1221 solution1221 = new Solution1221();
        assertThat(solution1221.balancedStringSplit(input)).isEqualTo(1);
    }
}