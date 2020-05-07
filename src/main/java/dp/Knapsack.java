package dp;

/**
 * @author qpzm7903
 * @since 2020-03-08-21:24
 */

public class Knapsack {
    public int knapsack(int[] items, int n, int weight) {
        boolean[][] status = new boolean[n][weight + 1];
        status[0][0] = true;
        if (items[0] <= weight) {
            status[0][items[0]] = true;
        }
//        for (int i = 0; i < ; i++) {
//
//        }
        return 0;
    }
}
