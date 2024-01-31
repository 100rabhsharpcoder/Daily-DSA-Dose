package Trees;

/**
 * LeetCode236LowestCommonAncestorBinaryTree
 */
public class LeetCode236LowestCommonAncestorBinaryTree {

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

    public TreeNode lca(TreeNode root, int p, int q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if(left == null){
            return right;
        } 
        else if (right  == null) {
            return left;
        } else{
            return root;
        }
    }
}