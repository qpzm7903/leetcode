package greedyAlgorithm;

import org.junit.rules.Stopwatch;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2019-12-19-7:36
 */

public class Solution406 {
    public static int[][] reconstructQueue(int[][] people) {
        if (0 == people.length || 0 == people[0].length) {
            return null;
        }
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> res = new LinkedList<>();
        for (int[] i : people) {
            res.add(i[1], i);
        }
        return res.toArray(new int[people.length][2]);
    }
}
