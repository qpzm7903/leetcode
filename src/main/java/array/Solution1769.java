package array;

/**
 * @program: leetcode
 * @description: TODO description
 * @author: qpzm7903
 * @create: 2021-06-25 21:30
 */

public class Solution1769 {
    // TODO: 2020/6/25 first time
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            result[i] = caculate(i, boxes);
        }
        return result;
    }

    private int caculate(int i, String boxes) {
        int value = 0;
        for (int j = 0; j < i; j++) {
            if (boxes.charAt(j) == '1') {
                value += (i - j);
            }
        }
        for (int j = i + 1; j < boxes.length(); j++) {
            if (boxes.charAt(j) == '1') {
                value += (j - i);
            }
        }
        return value;
    }

}
