package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * LeetCode103BinaryTreeZigzagLevelOrderTraversal
 */
public class LeetCode103BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {
        
    }
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> zigzag = new ArrayList<>();
         if (root == null) {
            return zigzag;
         }

         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         boolean flag = false;
         while (!queue.isEmpty()) {
         Stack<Integer> reverseStack = new Stack<>();

            List<Integer> level = new ArrayList<>();
            int size  = queue.size();

            for(int i=0; i<size; i++){
                if (flag) {
                    reverseStack.add(root.val);
                }else{
                    level.add(root.val);
                }

                if (root.left!=null) {
                    queue.add(root.left);
                }
                if (root.right!=null) {
                    queue.add(root.right);
                }

            }
            flag = !flag;
            while (!reverseStack.isEmpty()) {
                level.add(reverseStack.pop());
            }
            zigzag.add(level);
         }


        return zigzag;
    }
}