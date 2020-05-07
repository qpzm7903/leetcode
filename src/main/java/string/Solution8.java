package string;

import java.util.*;

/**
 * @author qpzm7903
 * @since 2020-04-04-10:27
 */

public class Solution8 {


    public int myAtoi(String str) {
        DFA dfa = new DFA();
        for (char c : str.toCharArray()) {
            dfa.process(c);
        }
        return (int)dfa.ans * dfa.sign;
    }

}

class DFA {
    long ans = 0;
    int sign = 1;
    String status = "start";
    Map<String, List<String>> statusMap = new HashMap<>();

    public DFA() {
        statusMap.put("start", Arrays.asList("start", "signed", "number", "end"));
        statusMap.put("signed", Arrays.asList("end", "end", "number", "end"));
        statusMap.put("number", Arrays.asList("end", "end", "number", "end"));
        statusMap.put("end", Arrays.asList("end", "end", "end", "end"));
    }

    public int getNextStatue(Character character) {
        if (Character.isSpaceChar(character)) {
            return 0;
        } else if (character == '-' || character == '+') {
            return 1;
        } else if (Character.isDigit(character)) {
            return 2;
        }
        return 3;
    }

    public void process(Character character) {
        status = statusMap.get(status).get(getNextStatue(character));
        if (status.equals("number")) {
            ans = ans*10 + character-'0';
            if (sign == 1) {
                ans = Math.min(ans, Integer.MAX_VALUE);
            } else {
                ans = Math.min(ans, -(long)Integer.MIN_VALUE);
            }
        } else if (status.equals("signed")) {
            sign = character == '+' ? 1:-1;
        }
    }
}
