package backTracking;

/**
 * @author qpzm7903
 * @since 2020-03-08-16:39
 */

public class Knapsack {
    int maxValue = Integer.MIN_VALUE;

    public void backTracking(int[] items, int currentIndex, int currentWeight, int knapsackWeight) {
        if (currentIndex == items.length - 1 || currentWeight == knapsackWeight) {
            if (maxValue < currentWeight) {
                maxValue = currentWeight;
            }
            return;
        }
        backTracking(items, currentIndex + 1, currentWeight, knapsackWeight);
        if (currentWeight + items[currentIndex] <= knapsackWeight) {
            backTracking(items, currentIndex + 1, currentWeight + items[currentIndex], knapsackWeight);
        }
    }
}
