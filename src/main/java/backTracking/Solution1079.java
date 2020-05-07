package backTracking;

import java.util.Arrays;

/**
 * @author qpzm7903
 * @since 2020-05-02-13:55
 */

public class Solution1079 {
    int count = 0;

    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        dfs(chars, used, 0);
        return count - 1;

    }

    private void dfs(char[] chars, boolean[] used, int depth) {
        count++;
        if (depth == chars.length) {
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            dfs(chars, used, depth + 1);
            used[i] = false;
        }
    }
}
