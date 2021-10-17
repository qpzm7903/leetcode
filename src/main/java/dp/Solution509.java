package dp;

import java.util.HashMap;
import java.util.Map;

public class Solution509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public Map<Integer, Integer> map = new HashMap<>();

    public int fib2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (map.keySet().contains(n)) {
            return map.get(n);
        } else {
            map.put(n, fib(n - 1) + fib(n - 2));
            return map.get(n);
        }
    }

    /**
     * result only affected by n-1 and n-2 , so can use rolling array idea
     * @param n
     * @return
     */
    public int fib3(int n){
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q; 
            q = r; 
            r = p + q;
        }
        return r;
    }

}
