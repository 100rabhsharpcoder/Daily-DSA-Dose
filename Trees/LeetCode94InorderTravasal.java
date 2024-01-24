package Trees;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94InorderTravasal {
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

    public List<Integer> inorderTravasal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        return isHelper( root , list);
    }

    public List<Integer> isHelper(TreeNode root , List<Integer> list){
        if(root == null){
            return list;
        }
        isHelper(root.left, list);
        list.add(root.val);
        isHelper(root.right, list);
        return list;
    }
}
