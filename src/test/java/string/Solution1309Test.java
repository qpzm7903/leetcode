package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1309Test {
    @Test
    public void test_case1() {
        String s = "10#11#12";
        Assertions.assertEquals(new Solution1309().freqAlphabets(s), "jkab");

    }

    @Test
    public void test_case2() {
        String s = "1326#";
        Assertions.assertEquals(new Solution1309().freqAlphabets(s), "acz");
    }
    @Test
    public void test_case3() {
        String s = "25#";
        Assertions.assertEquals(new Solution1309().freqAlphabets(s), "y");
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
        Assertions.assertEquals(Solution1309.convert(1), "a");
    }

}