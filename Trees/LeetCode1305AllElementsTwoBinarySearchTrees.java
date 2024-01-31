package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode1305AllElementsTwoBinarySearchTrees
 */
public class LeetCode1305AllElementsTwoBinarySearchTrees {

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
    public TreeNode getAllElment(TreeNode root1, TreeNode root2){
         List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         List<Integer> result = new ArrayList<>();

         inOrderTravasal(root1, list1);
         inOrderTravasal(root2, list2);

         int i=0; int j=0;
         while (i<list1.size() && j<list2.size()) {
            if (list1.get(i)< list2.get(j)) {
                result.add(list1.get(i));
                i++;
            }else{
                result.add(list2.get(j));
                j++;
            }
         }

         while (i<list1.size()) {
            result.add(list1.get(i));
            i++;
         }
         while (j<list2.get(j)) {
            result.add(list2.get(j));
           j++;
         }

         return result;
    }
    public void inOrderTravasal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrderTravasal(root.left, list);
        list.add(root.val);
        inOrderTravasal(root.right, list);
    }
}