package algorithms4.cp1;

/**
 * 最大公约数算法
 *
 * @author qpzm7903
 * @since 2021-10-17-18:44
 */
public class Gcd {
    /**
     * 计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。否则，将p除以q得到余数r, p和q的最大公约数即为q和r的最大公约数。
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
