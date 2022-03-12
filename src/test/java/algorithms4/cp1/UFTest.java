package algorithms4.cp1;

import org.junit.jupiter.api.Test;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2022-02-22-7:05
 */
class UFTest {

    /**
     * input
     * 10
     * 4 3
     * 3 8
     * 6 5
     * 9 4
     * 2 1
     * 8 9
     * 5 0
     * 7 2
     * 6 1
     * 1 0
     * 6 7
     */
    @Test
    void test_simple_() {
        UF uf = new UF(10);
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9 , 4);
        uf.union(2, 1);
        uf.union(8, 9);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(1, 0);
        uf.union(6, 7);

        System.out.println(uf.count());

    }

}