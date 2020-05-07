package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qpzm7903
 * @since 2020-02-02-16:54
 */

public class Solution804 {
    static final String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<>();
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            String temp = "";
            for (char letter : wordChars) {
                temp += convert(letter);
            }
            result.add(temp);
        }
        return result.size();
    }

    static String convert(char letter) {
        int index = letter - 'a';
        return mos[index];
    }
}
