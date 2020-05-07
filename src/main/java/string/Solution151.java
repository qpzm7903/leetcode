package string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author qpzm7903
 * @since 2020-04-10-7:20
 */

public class Solution151 {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        String[] strings = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            strings[i] = split[split.length - i - 1];
        }
        return String.join(" ", strings);
    }
}
