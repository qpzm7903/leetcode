package BFS;


import org.junit.Test;

public class SolutionM529Test {

    @Test
    public void test_1() {
        char[][] board = {{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};


        SolutionM529 solutionM529 = new SolutionM529();
        char[][] chars = solutionM529.updateBoard(board, new int[]{3, 0});
        printBoard(chars);
    }

    void printBoard(char[][] chars) {
        for (char[] aChar : chars) {
            for (char c : aChar) {
                System.out.print(c + " ");
            }
            System.out.println();

        }
    }
}