#回溯算法的简单总结
```java
public class Dfs{
    void dfs(int[] nums, LinkedList<Integer> path) {

        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) continue;  // 剪枝
            path.add(nums[i]); // 选择
            dfs(nums, path); // 决策
            path.removeLast(); // 取消选择
        }
    }
}

```
回溯算法其实就是对所有可能的枚举，然后进行剪枝操作。

leetcode46题是单纯的剪枝，leetcode47除了对当前路径的剪枝之外，还要考虑其他路径，因为题目说的是不能重复。

leetcode47题目描述：

>给定一个可包含重复数字的序列，返回所有不重复的全排列。

所以不能和46简单的进行剪枝了。

参考了答案之后如下

```java
public class Solution47 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, path, used);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i>0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            path.addLast(nums[i]);

            used[i] = true;
            dfs(nums, path, used);
            used[i] = false;

            path.removeLast();
        }
    }
}
```

对于重复的同一层节点，通过 nums[i] == nums[i-1] 去剪枝，但是不够，这样可能导致上下层被剪枝掉，如果需要判断 !used[i-1] ，也就是判断
上一个节点没有被使用，这样才满足同层剪枝，上下层元素相同不剪枝的要求。

## 经典n皇后问题 
要么输出方案，要么输出题解数量




## 回溯问题 
总的来说，就是要做选择，根据选择进行下一次递归，递归结束之后取消选择。

每次做选择之前，进行一次判断，看看是否要做这次选择。

比如在n皇后问题里面就用了这样一个数组

```java
        boolean[] usedColumn = new boolean[n];

        if (usedColumn[column]) continue;
```
记录当前行用的时候哪一列。

一般来说，回溯就是对问题的树形空间每一次往那个分支进行，因此可以记录上次、或者已经使用的，不进行重复的递归。



### 组合数 39 40 31

组合数，也就是target，可以用加法，也可以用减法达到

下面是使用加法，使用加法的去重和减法的去重都可以用。
```java
public class Solution39 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> temp = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, temp, 0);
        return res;
    }

    private void dfs(int[] candidates, int target, LinkedList<Integer> temp, int sum) {
        if (sum == target) {
            res.add(new LinkedList<>(temp));
        } else if (sum > target) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (temp.size()!=0 && temp.peekLast() > candidates[i])continue;
            temp.addLast(candidates[i]);
            dfs(candidates, target, temp, sum + candidates[i]);
            temp.removeLast();
        }
    }
}
```

然后使用一个减法,另外这个去重是判断不能使用之前的，所以只要限制搜索起点，并且排序。

比如 2 2 3 , 2 3 2，第二个显然是重复的，但是搜索2，然后3，这个时候因为搜索起点是从3开始，就不会搜到2了，前提是要排序。
```java
public class Solution39 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> temp = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, temp, 0);
        return res;
    }

    private void dfs(int[] candidates, int target, LinkedList<Integer> temp, int startIndex) {
        if (target == 0) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {

            if (target - candidates[i] < 0) break;
            temp.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], temp, i);
            temp.removeLast();
        }
    }
}
```

