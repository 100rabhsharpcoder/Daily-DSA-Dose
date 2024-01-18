package linkedList;

public class ReverseLinkedListKgroup {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode reverseKGroup(ListNode head , int k){

        if (head == null ) {
            return head;
        }

        ListNode prev = null;
        ListNode curr =  head;
        ListNode next = null;
        int count =0;

        while (count < k && curr != null) {
            next =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next!=null) {
            head.next = reverseKGroup(next, k);
        }
         return prev; 
    }
    
}
