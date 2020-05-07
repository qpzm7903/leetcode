package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author qpzm7903
 * @since 2020-03-28-7:59
 */

public class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[j].equals(words[i])) {
                    break;
                } else if (words[j].endsWith(words[i])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                set.add(words[i]);
            }

        }
        return set.stream().mapToInt(String::length).sum() + set.size();
    }
}
