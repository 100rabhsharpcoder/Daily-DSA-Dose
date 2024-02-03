package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.tree.TreeCellRenderer;

public class LeetCode653TwoSumIVInputBST {
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
    public boolean findTarget(TreeNode root , int k){
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++){
            int compliment  = k-list.get(i);
            if(map.containsKey(compliment)){
                return true;
            }else{
              map.put(list.get(i), i);
            }
        }
        return false;

    } 

    public void inOrder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
