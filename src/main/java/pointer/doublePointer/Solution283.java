package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-26-22:01
 */

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int lastNotZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[lastNotZero++] = nums[i];
            }
        }
        for (int i = lastNotZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
