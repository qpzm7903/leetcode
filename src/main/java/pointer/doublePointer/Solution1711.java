package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-25-19:05
 */

public class Solution1711 {
    public int findClosest(String[] words, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                p1 = i;
            } else if (word.equals(word2)) {
                p2 = i;
            } else if (p1 != -1 && p2 != -1) {
                res = Math.min(res, Math.abs(p1 - p2));
            }
        }
        return res;
    }
}
