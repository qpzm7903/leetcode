package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-05-03-9:22
 */

public class Solution1415 {
    char[] candidates = new char[]{'a', 'b', 'c'};
    List<String> res = new ArrayList<>();
    public String getHappyString(int n, int k) {
        LinkedList<Character> temp = new LinkedList<>();
        dfs(n, 0,temp);
        res.sort(String::compareTo);
        return res.size()>=k?res.get(k-1):"";

    }

    private void dfs(int n, int preIndex, LinkedList<Character> temp) {
        if (temp.size() == n) {
            StringBuilder sb = new StringBuilder();
            for (Character character : temp) {
                sb.append(character);
            }
            res.add(sb.toString());
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (i == preIndex) continue;
            temp.addLast(candidates[i]);
            dfs(n, i, temp);
            temp.removeLast();
        }
    }
}
