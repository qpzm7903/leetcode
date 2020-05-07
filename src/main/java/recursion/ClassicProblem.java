package recursion;

/**
 * @author qpzm7903
 * @since 2019-12-12-23:06
 */

public class ClassicProblem {


    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }


    public static void hanoiTower(int n, int from, int buffer, int to) {
        if (n == 1) {
            System.out.println(String.format("move %d from %d to %d through %d ", n, from, to, buffer));
        } else {
        hanoiTower(n-1,from,to,buffer);
        hanoiTower(1,from,buffer,to);
        hanoiTower(n-1,buffer,from,to);
        }
    }
}
