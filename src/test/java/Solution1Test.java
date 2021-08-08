import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    @Test
    void test_case_1() {
        int[] given = new int[]{2, 7, 11, 15};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{0, 1}, new Solution1().twoSum(given, target));
        Assertions.assertArrayEquals(new int[]{0, 1}, new Solution1().twoSum_2(given, target));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }


}