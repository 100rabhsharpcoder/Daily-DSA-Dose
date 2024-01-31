package Trees;

import linkedList.recursiveInsert;

/**
 * LeetCode108ConvertSortedArraytoBinarySearchTree
 */
public class LeetCode108ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {
        
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0){
            return null;
        }
        return buildBst(nums ,0, nums.length-1);

    }

    private TreeNode buildBst(int[] nums, int low , int high){
        if (low>high) {
            return null;
        }
        int  mid =  low + (high -low)/2;

        TreeNode root =  new TreeNode(nums[mid]);
        root.left =buildBst(nums, low, mid-1);
        root.right =buildBst(nums,  mid+1, high);
     return root;
    }
}