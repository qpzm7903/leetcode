package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 第 N 个泰波那契数
 *
 * @author qpzm7903
 * @since 2021-10-18-7:08
 */
public class Solution1137 {

    /**
     * 超时
     *
     * @param n
     * @return
     */
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
    }

    /**
     * ac
     *
     * @param n
     * @return
     */
    private Map<Integer, Integer> memory = new HashMap<>();

    public int tribonacciWithMemory(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memory.containsKey(n)) {
            return memory.get(n);
        } else {
            int i = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
            memory.put(n, i);
            return i;
        }
    }

    /**
     * 迭代解决
     * 只和 n0 n1 n2有关系，所以使用滚动数组节省空间，注意滚动数组的起始条件
     *
     * @param n
     * @return
     */
    public int tribonaciWithIter(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int n0 = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        for (int i = 3; i <= n; i++) {
            n0 = n1;
            n1 = n2;
            n2 = n3;
            n3 = n0 + n1 + n2;
        }
        return n3;
    }
}
