package linkedList;

public class LeetCode725SplitLinkedListParts {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }
    public ListNode[] spListNodesIntoParts(ListNode head , int k ){
        ListNode[]  ans = new ListNode[k];
        int totalLen = 0;
        ListNode it = head;
        while (it != null) {
            totalLen++;
            it = it.next;
        }

       int len = totalLen/k;
       int distribute = totalLen%k;
       ListNode node = head;
       ListNode prev = null;
       int i=0;
       while (node!=null && i<k) {
        ans[i] =node;
        for(int j=0; j<len+(distribute> 0 ? 1: 0); j++){
            prev = node;
            node = node.next;
        }
        prev.next = null;
        i++;
        distribute--;
       }
       return ans;
    } 
}
