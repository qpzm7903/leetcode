package stack;

import java.util.Stack;

/**
 * @author qpzm7903
 * @since 2020-05-16-9:16
 */

public class SolutionH84 {
    /**
     * 暴力解法，超时
     *
     * @param heights heights
     * @return 最大面积
     */
    public int largestRectangleAreaByForce(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int minHeight = heights[i];
                for (int k = i; k <= j; k++) {
                    minHeight = Math.min(minHeight, heights[k]);
                }
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    /**
     * 暴力解法--->优化
     * 执行用时 :1024 ms, 在所有 Java 提交中击败了13.49%的用户
     * 内存消耗 :41.8 MB, 在所有 Java 提交中击败了13.04%的用户
     *
     * @param heights heights
     * @return 最大面积
     */
    public int largestRectangleAreaByForceAndOptimization(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    /**
     * 分而治之
     * 找到最矮的柱子，那么最大面积可能是以下三种情况
     * 1、从最矮柱子向两侧延申到尽头的举行
     * 2、最大面积在最矮柱子的左侧---->找到左侧最矮柱子--->子问题
     * 3、最大面积在最矮柱子的右侧---->找到右侧最矮柱子--->子问题
     * <p>
     * 执行用时 :756 ms, 在所有 Java 提交中击败了29.80%的用户
     * 内存消耗 :45.3 MB, 在所有 Java 提交中击败了6.52%的用户
     *
     * @param heights heights
     * @return 最大面积
     */
    public int largestRectangleAreaByDivideConquer(int[] heights) {
        return divideConquerCal(heights, 0, heights.length - 1);
    }

    private int divideConquerCal(int[] heights, int left, int right) {
        if (left > right) {
            return 0;
        }
        int minIndex = left;
        for (int i = left; i <= right; i++) {
            if (heights[i] < heights[minIndex]) {
                minIndex = i;
            }
        }
        return Math.max(heights[minIndex] * (right - left + 1),
                Math.max(divideConquerCal(heights, left, minIndex - 1),
                        divideConquerCal(heights, minIndex + 1, right)));

    }

    /**
     *
     *
     * @param heights heights
     * @return 最大面积
     */
    public int largestRectangleAreaByStack(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        // 单调递增的栈，遇到递减，就计算最大面积，每个子最大面积就在 stack.peek() ---- i 之间
        // 如果遇到了 stack.peek() == 1 ，那就说明遇到了目前最矮的高度，所以宽度就是  0-i ，
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                maxArea = Math.max(maxArea, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            maxArea = Math.max(maxArea, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return maxArea;
    }


}
