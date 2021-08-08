package dp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeCoinTest {

    @Test
    public void test() {
//        Assertions.assertEquals(new ChangeCoin().recurseFromZero(9),3);
//        Assertions.assertEquals(new ChangeCoin().recurseFromZeroAndMemory(9),3);
        Assertions.assertEquals(new ChangeCoin().dpTable(9), 3);
    }

    @Test
    public void test_20() {
//        System.out.println(new ChangeCoin().recurseFromZero(100));
        long t1 = System.currentTimeMillis();

        System.out.println(new ChangeCoin().recurseFromZeroAndMemory(100));
        long t2 = System.currentTimeMillis();


        System.out.println(t2 - t1);


        t1 = System.currentTimeMillis();
        System.out.println(new ChangeCoin().dpTable(100));
        t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

    }


}