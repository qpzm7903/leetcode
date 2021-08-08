package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClassicProblemTest {


    @Test
    public void test_factorial() {
        int i = 3 ;
        Assertions.assertEquals(ClassicProblem.factorial(i), 6);
    }

    @Test
    public void test_hanoi() {
        int i=5;
        System.out.println();
        ClassicProblem.hanoiTower(3, 1, 2, 3);
    }



}