package backTracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-29-22:15
 */

public class Solution0807 {
    List<String> res = new LinkedList<>();
    public String[] permutation(String S) {
        char[] chars = S.toCharArray();
        boolean[] used = new boolean[chars.length];
        LinkedList<Character> characters = new LinkedList<>();
        dfs(chars, used, characters);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(char[] chars, boolean[] used, LinkedList<Character> characters) {
        if (characters.size() == chars.length) {
            StringBuilder sb = new StringBuilder();
            for (Character character : characters) {
                sb.append(character);
            }
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            characters.addLast(chars[i]);
            used[i] = true;
            dfs(chars, used, characters);

            used[i] = false;
            characters.removeLast();
        }
    }
}
