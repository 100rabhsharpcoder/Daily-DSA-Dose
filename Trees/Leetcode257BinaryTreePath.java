package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode257BinaryTreePath
 */
public class Leetcode257BinaryTreePath {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root!=null) {
            binaryTreePathsHelper(root, "", result);
        }
        return result;
    }

    public void binaryTreePathsHelper(TreeNode root ,String currentPath, List<String> result){
        if (root == null) {
            result.add(currentPath + root.val);
        }

        if (root.left != null) {
            binaryTreePathsHelper(root, currentPath+root.val+"->", result);
        }
        if (root.right != null) {
            binaryTreePathsHelper(root, currentPath+root.val+"->", result);
        }
    }
}