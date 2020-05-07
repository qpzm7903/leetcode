package string;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution22Test {

    List<String> result_n_1 = Collections.singletonList("()");

    List<String> result_n_2 = Arrays.asList(
            "(())",
            "()()");

    List<String> result_n_3 = Arrays.asList(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()");
    List<String> result_n_4 = Arrays.asList(
            "(((())))",
            "((()()))",
            "((())())",
            "((()))()",
            "(()(()))",
            "(()()())",
            "(()())()",
            "(())(())",
            "(())()()",
            "()((()))",
            "()(()())",
            "()(())()",
            "()()(())",
            "()()()()");


    @Test
    public void test() {
        Solution22 solution22 = new Solution22();
        String[] strings = {
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        };

        List<String> result = Arrays.asList(strings);
        assertThat(solution22.generateParenthesis(3)).isEqualTo(result);
        assertThat(solution22.generateParenthesisWithBackTrackingMethod(3)).isEqualTo(result);
        assertThat(solution22.generateParenthesisWithDfsSubtraction(3)).isEqualTo(result);
        assertThat(solution22.generateParenthesisWithDfsAdd(3)).isEqualTo(result);
        assertThat(solution22.generateParenthesis5(3)).isEqualTo(result);
//        assertThat(solution22.dpMethod(3)).isEqualTo(result);
        assertThat(solution22.myMethod1(3)).isEqualTo(result);
    }

    /**
     * 完全递归
     */
    @Test
    public void test2() {
        Solution22 solution22 = new Solution22();
        String[] strings = {
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        };

        List<String> result = Arrays.asList(strings);
        assertThat(solution22.myMethod1(3)).isEqualTo(result);
    }

    /**
     * 剪枝递归
     */
    @Test
    public void test3() {
        Solution22 solution22 = new Solution22();
        String[] strings = {
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        };

        List<String> result = Arrays.asList(strings);
        assertThat(solution22.myMethod2(3)).isEqualTo(result);
    }
}