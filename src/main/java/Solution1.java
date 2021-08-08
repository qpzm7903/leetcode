import java.util.HashMap;
import java.util.Map;

public class Solution1 {


    /**
     * @since 2021-08-08-10:30
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{1, 2};
    }

    /**
     * @since 2021-08-08-14:26
     */
    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int anotherPart = target - nums[i];
            Integer index = cache.get(anotherPart);
            if (index != null) {
                return new int[]{index, i};
            } else {
                cache.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
