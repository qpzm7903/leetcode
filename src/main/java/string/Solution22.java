package string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qpzm7903
 * @since 2019-12-25-22:55
 */

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(new char[2 * n], 0, result);
        return result;
    }

    public List<String> generateParenthesisWithBackTrackingMethod(int n) {
        List<String> result = new ArrayList<>();
        backTrackingMethod(result, "", 0, 0, n);
        return result;
    }

    public List<String> generateParenthesisWithDfsSubtraction(int n) {
        List<String> result = new ArrayList<>();
        dfsSubtraction(result, n, n, "");
        return result;
    }

    public List<String> generateParenthesisWithDfsAdd(int n) {
        List<String> result = new ArrayList<>();
        dfsAdd(result, 0, 0, "", n);
        return result;
    }

    public List<String> dpMethod(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        List<List<String>> dp = new ArrayList<>();
        List<String> n0 = new ArrayList<>();
        n0.add("");
        dp.add(n0);

        for (int i = 1; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> dpP = dp.get(j);
                List<String> dpQ = dp.get(i - j - 1);
                for (String strings : dpP) {
                    for (String s : dpQ) {
                        temp.add("(" + strings + ")" + s);
                    }
                }
            }
            dp.add(temp);
        }
        return dp.get(n);
    }

    public List<String> generateParenthesis5(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node("", n, n));
        n = n * 2;
        while (n > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currNode = queue.poll();
                if (currNode.left > 0) {
                    queue.offer(new Node(currNode.currStr + "(", currNode.left - 1, currNode.right));
                }
                if (currNode.right > currNode.left && currNode.right > 0) {
                    queue.offer(new Node(currNode.currStr + ")", currNode.left, currNode.right - 1));
                }
            }
            n --;
        }
        while (!queue.isEmpty()) {
            result.add(queue.poll().currStr);
        }
        return result;
    }

    private void dfsSubtraction(List<String> res, int left, int right, String curr) {
        if (left == 0 && right == 0) {
            res.add(curr);
            return;
        }
        if (left > 0) {
            dfsSubtraction(res, left - 1, right, curr + "(");
        }
        if (right > left && right > 0) {
            dfsSubtraction(res, left, right - 1, curr + ")");
        }
    }


    private void dfsAdd(List<String> res, int left, int right, String curr, int n) {
        if (left == n && right == n) {
            res.add(curr);
            return;
        }
        if (left < n) {
            dfsAdd(res, left + 1, right, curr + "(", n);
        }
        if (right < left && right < n) {
            dfsAdd(res, left, right + 1, curr + ")", n);
        }
    }


    private void backTrackingMethod(List<String> result, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            result.add(curr);
        } else {
            if (open < max) {
                backTrackingMethod(result, curr + '(', open + 1, close, max);
            }
            if (open > close) {
                backTrackingMethod(result, curr + ')', open, close + 1, max);
            }

        }
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }


    static class Node {
        private String currStr;
        private int left;
        private int right;

        public Node(String currStr, int left, int right) {
            this.currStr = currStr;
            this.left = left;
            this.right = right;

        }
    }


    public List<String> myMethod1(int n) {
        ArrayList<String> res = new ArrayList<>();

        if (n == 0) {
            return res;
        }
        recurse(n * 2,0, "",res);
        return res;
    }

    public void recurse(int total,int currentCount, String currentParentheses, List<String> res) {
        if (total == currentCount) {
            if (validParentheses(currentParentheses)) {
                res.add(currentParentheses);
            }
            return;
        }
        recurse(total, currentCount + 1, currentParentheses + "(", res);
        recurse(total, currentCount + 1, currentParentheses + ")", res);
    }

    private boolean validParentheses(String currentParentheses) {
        int count = 0;
        for (char c : currentParentheses.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else {
                count -= 1;
            }
            if (count < 0) {
                return false;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    // 剪枝
    public List<String> myMethod2(int n) {
        ArrayList<String> res = new ArrayList<>();

        if (n == 0) {
            return res;
        }
        recurse2(n * 2, 0, n, n, "", res);
        return res;
    }

    private void recurse2(int totalCount, int currentCount, int leftCount, int rightCount, String currentString, ArrayList<String> res) {
        if (leftCount < 0 || rightCount < 0) {
            return;
        }
        if (leftCount > rightCount) {
            return;
        }
        if (totalCount == currentCount && leftCount==0 && rightCount == 0) {
            res.add(currentString);
            return;
        }
        recurse2(totalCount, currentCount + 1, leftCount - 1, rightCount, currentString + "(", res);
        recurse2(totalCount, currentCount + 1, leftCount, rightCount - 1, currentString + ")", res);
    }


    /**
     * 动态规划 知道一对括号，怎么得到两队括号的？ 得到两队括号，怎么得到三队括号哦？
     * @return
     */
    public List<String> myMethod3() {
        return null;
    }

}
