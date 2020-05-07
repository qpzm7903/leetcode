package string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1309Test {
    @Test
    public void test_case1() {
        String s = "10#11#12";
        assertThat(new Solution1309().freqAlphabets(s)).isEqualTo("jkab");

    }

    @Test
    public void test_case2() {
        String s = "1326#";
        assertThat(new Solution1309().freqAlphabets(s)).isEqualTo("acz");
    }
    @Test
    public void test_case3() {
        String s = "25#";
        assertThat(new Solution1309().freqAlphabets(s)).isEqualTo("y");
    }

    @Test
    public void test() {
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('A'));

        System.out.println((int)'a');
        System.out.println((int)'A');

        System.out.println((char) (0 + 97));

        System.out.println((char)('1'+'1'));

        System.out.println((int)('1'-'0'));

        System.out.println((char)('a'+11));
    }

    @Test
    public void testConvert() {
        assertThat(Solution1309.convert(1)).isEqualTo("a");
    }

}