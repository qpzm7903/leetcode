package dp;

/**
 * @author qpzm7903
 * @since 2020-03-17-20:58
 */

public class ChangeCoin {

    int minCount = Integer.MAX_VALUE;

    public int recurseFromZero(int n) {
        help(n, 0, 0);
        return minCount;
    }

    private void help(int n, int curr, int count) {
        if (curr == n) {
            minCount = Math.min(minCount, count);
        }
        if (curr > n) {
            return;
        }
        help(n, curr + 1, count + 1);
        help(n, curr + 3, count + 1);
        help(n, curr + 5, count + 1);
    }


    public int recurseFromZeroAndMemory(int n) {
        int[] memory = new int[n + 1];
        memory[n] = Integer.MAX_VALUE;
        helpWithMemory(n, 0, 0, memory);
        return memory[n];
    }

    private void helpWithMemory(int n, int curr, int count, int[] memory) {

        if (curr == n) {
            memory[n] = Math.min(memory[n], count);
            return;
        }
        if (curr > n) {
            return;
        }
        if (memory[curr] != 0 && memory[curr] < count) {
            return;
        } else {
            memory[curr] = count;
        }
        helpWithMemory(n, curr + 1, count + 1, memory);
        helpWithMemory(n, curr + 3, count + 1, memory);
        helpWithMemory(n, curr + 5, count + 1, memory);
    }

    public int dpTable(int n) {
        if (n == 1 || n == 3 || n == 5) {
            return 1;
        }
        int[] status = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            status[i] = n;
        }
        status[1] = 1;
        status[3] = 1;
        status[5] = 1;
        for (int i = 0; i < n + 1; i++) {
            if (i + 1 <= n) {
                status[i + 1] = Math.min(status[i] + 1, status[i + 1]);
            }
            if (i + 3 <= n) {
                status[i + 3] = Math.min(status[i] + 1, status[i + 3]);
            }
            if (i + 5 <= n) {
                status[i + 5] = Math.min(status[i] + 1, status[i + 5]);
            }
        }
        return status[n];
    }
}
