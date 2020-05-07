package tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-19-9:07
 */

public class Solution1035 {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res.add(2);
        res.add(1);
        res.sort(Comparator.comparingInt(a -> a));
        System.out.println(res);

    }
}
