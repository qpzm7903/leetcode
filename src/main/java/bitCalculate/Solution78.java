package bitCalculate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qpzm7903
 * @since 2019-12-06-21:42
 */

public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        int count = (int) Math.pow(2,nums.length);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < count; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < nums.length; j++) {
                if ( ((i>>j)&1) == 1) {
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
