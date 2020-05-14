package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2020-05-14-7:43
 */

public class SolutionM210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            inDegrees[prerequisite[0]]++;
            adjacency.get(prerequisite[1]).add(prerequisite[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.add(i);
            }
        }
        int[] result = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            ;
            Integer source = queue.poll();
            result[index++] = source;
            for (Integer target : adjacency.get(source)) {
                inDegrees[target]--;
                if (inDegrees[target] == 0) {
                    queue.add(target);
                }
            }
        }
        return numCourses == index ? result : new int[0];
    }
}
