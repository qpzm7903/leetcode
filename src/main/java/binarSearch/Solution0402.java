package binarSearch;


import tree.TreeNode;

/**
 * @author qpzm7903
 * @since 2020-04-16-21:42
 */

public class Solution0402 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return binarySearch(nums,0,nums.length);
    }

    private TreeNode binarySearch(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = binarySearch(nums, left, mid - 1);
        root.right = binarySearch(nums, mid+1,right);
        return root;
    }
}
