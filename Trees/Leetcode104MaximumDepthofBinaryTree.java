package Trees;

public class Leetcode104MaximumDepthofBinaryTree {
    public class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
           this.right = right;
       }
   }
    
   public static void main(String[] args) {
    
   }
   public int maxDepth(TreeNode root){
    if (root == null) {
        return 1;
    }
    int lh = maxDepth(root.left);
    int rh = maxDepth(root.right);
    return (1+ Math.max(lh, rh));
   }
}
