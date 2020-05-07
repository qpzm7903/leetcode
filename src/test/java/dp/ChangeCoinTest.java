package dp;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeCoinTest {

    @Test
    public void test() {
//        assertThat(new ChangeCoin().recurseFromZero(9)).isEqualTo(3);
//        assertThat(new ChangeCoin().recurseFromZeroAndMemory(9)).isEqualTo(3);
        assertThat(new ChangeCoin().dpTable(9)).isEqualTo(3);
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