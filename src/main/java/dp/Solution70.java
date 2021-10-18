package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>爬楼梯</h3>
 * <p>假设你正在爬楼梯。需要 n 阶你才能到达楼顶。</p>
 *
 * <p>每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>
 *
 * <p>注意：给定 n 是一个正整数。</p>
 *
 * @author qpzm7903
 * @since 2021-10-18-7:30
 */
public class Solution70 {

    /**
     * recurse
     * overtime
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 带记忆,
     * 有内存消耗
     *
     * @param n
     * @return
     */
    public Map<Integer, Integer> map = new HashMap<>();

    public int climbStairsWithMemory(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int i = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, i);
            return i;
        }
    }


    /**
     * 滚动数组，迭代很快，时间复杂度位O(n)，但是当n很大的时候，仍然比较慢，可以缩减到 O(logn) 或这 O(n)的复杂度 涉及数学。。。
     *
     * @param n
     * @return
     */
    public int climbStairsWithIter(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
