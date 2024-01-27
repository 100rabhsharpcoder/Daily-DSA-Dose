package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode513FindBottomLeftTreeValue {
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

    public static void main(String[] args) {

    }

    public int findBottomLeftValue(TreeNode root) {
        int leftMost = root.val;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        int size  = queue.size();
        for(int i=0 ; i<size; i++){
            TreeNode cur = queue.poll();
            if(i==0){
                leftMost = cur.val;

            }
            if (cur.left!=null) {
                queue.offer(cur.left);
            }
            if (cur.right!=null) {
                queue.offer(cur.right);
            }
        }
    }
        return leftMost;
    }
}
