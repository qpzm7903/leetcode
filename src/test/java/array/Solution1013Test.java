package array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution1013Test {


    @Test
    public void canThreePartsEqualSum() {
        int[] input = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        assertThat(new Solution1013().canThreePartsEqualSum(input)).isEqualTo(true);

    }

    @Test
    public void canThreePartsEqualSum_case_2() {
        int[] input = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        assertThat(new Solution1013().canThreePartsEqualSum(input)).isEqualTo(false);

    }

    @Test
    public void canThreePartsEqualSum_case_3() {
        int[] input = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        assertThat(new Solution1013().canThreePartsEqualSum(input)).isEqualTo(true);

    }

    @Test
    public void canThreePartsEqualSum_case_4() {
        int[] input = {18, 12, -18, 18, -19, -1, 10, 10};
        assertThat(new Solution1013().canThreePartsEqualSum(input)).isEqualTo(true);

    }
}