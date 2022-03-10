package dp;

/**
 * 1,5,10,50,100,500元硬币各有c1, c2, c3, c4, c5, c6枚，要用来支付A元，则最少需要多少枚？
 */
public class Coin1 {
    private static final int[] coins = {1, 5, 10, 50, 100, 500};

    public static int changeCoin(int money,int[] inputs) {
        int ans = 0;
        for (int i = 5; i >= 0; i--) {
            int t = Math.min(money / coins[i], inputs[i]);
            money -= t * coins[i];
            ans += t;

        }
        return ans;

    }
}
