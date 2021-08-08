package dp;

import org.junit.jupiter.api.Test;

public class Knapsack01Test {
    @Test
    public void test_case1() {
        Knapsack01 knapsack01 = new Knapsack01();
        int i = knapsack01.knapsack01(5, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(i);
    }

}