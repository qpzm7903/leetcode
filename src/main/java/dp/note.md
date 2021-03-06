### 动态规划
明确状态->定义状态(数组/函数)->明确选择->明确base case

一个套路
>
    for 状态1 in 状态1的所有取值：
     for 状态2 in 状态2的所有取值：
         for ...
             dp[状态1][状态2][...] = 计算(选择1，选择2...)

#### 以322换零钱为例
给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。

示例 1:
>
    输入: coins = [1, 2, 5], amount = 11
    输出: 3 
    解释: 11 = 5 + 5 + 1
示例 2:
>
    输入: coins = [2], amount = 3
    输出: -1
 
说明:
你可以认为每种硬币的数量是无限的。

状态：在换零钱的过程中，自己的总金额是不断变化的，所以是一个变化的量，是一个状态量

定义状态: dp[n] ,n 表示当前的总金额，那么dp[n]表示凑成金额为n的最少硬币个数

定义函数：dp[n]= dp[n-Xcoin]+1  dp[n-Xcoin] 表示在所有硬币中选择

选择：对于n来说，只要硬币小于n，就可以不断的选择，每次都可以选择所有的硬币，
>
>   枚举每一个硬币  和 每一个金额

base case:dp[0] = 0 dp[coin] = 1，每个硬币金额都为1

#### 518零钱问题，问有几种换零钱的方式
给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。 

 

示例 1:
>
    输入: amount = 5, coins = [1, 2, 5]
    输出: 4
    解释: 有四种方式可以凑成总金额:
    5=5
    5=2+2+1
    5=2+1+1+1
    5=1+1+1+1+1
示例 2:

> 
    输入: amount = 3, coins = [2]
    输出: 0
    解释: 只用面额2的硬币不能凑成总金额3。
    示例 3:
    
    输入: amount = 10, coins = [10] 
    输出: 1
 

注意:
你可以假设：
- 0 <= amount (总金额) <= 5000
- 1 <= coin (硬币面额) <= 5000
- 硬币种类不超过 500 种
- 结果符合 32 位符号整数


显然这个问题用回溯、剪枝的方式很自然，但是一下要想到动态规划就不太自然了。


### 1143M 最长公共子序列
// todo
#### 定义状态


```java
public class SolutionM1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length() + 1;
        int length2 = text2.length() + 1;
        int[][] dp = new int[length1][length2];
        for (int i = 1; i < length1; i++) {
            for (int j = 1; j < length2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
```



