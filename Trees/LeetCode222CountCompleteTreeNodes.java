package Trees;

/**
 * LeetCode222CountCompleteTreeNodes
 */
public class LeetCode222CountCompleteTreeNodes {
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
    public int countNode(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftheight = leftheight(root);
        int rightHeight = rightHeight(root);

        if(leftheight == rightHeight){
            return (1 << leftheight)-1;
        }else{
            return 1 + countNode(root.left) + countNode(root.right);
        }

    }

    private int leftheight(TreeNode node){
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    private int rightHeight(TreeNode node){
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}