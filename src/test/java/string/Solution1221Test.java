package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution1221Test {

    @Test
    public void balancedStringSplit() {
        String input = "RLRRLLRLRL";
        Solution1221 solution1221 = new Solution1221();
        Assertions.assertEquals(solution1221.balancedStringSplit(input), 4);
    }

    @Test
    public void balancedStringSplit2() {
        String input = "RLLLLRRRLR";
        Solution1221 solution1221 = new Solution1221();
        Assertions.assertEquals(solution1221.balancedStringSplit(input), 3);
    }

    @Test
    public void balancedStringSplit3() {
        String input = "LLLLRRRR";
        Solution1221 solution1221 = new Solution1221();
        Assertions.assertEquals(solution1221.balancedStringSplit(input), 1);
    }
}