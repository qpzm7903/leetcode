package recursion;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ClassicProblemTest {


    @Test
    public void test_factorial() {
        int i = 3 ;
        assertThat(ClassicProblem.factorial(i)).isEqualTo(6);
    }

    @Test
    public void test_hanoi() {
        int i=5;
        System.out.println();
        ClassicProblem.hanoiTower(3, 1, 2, 3);
    }



}