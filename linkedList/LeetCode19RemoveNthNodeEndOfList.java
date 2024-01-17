package linkedList;

public class LeetCode19RemoveNthNodeEndOfList {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        
    }

    public ListNode removeNthfromEnd(ListNode head , int n){

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstP = dummy;
        ListNode secondP = dummy;
        for(int i=0; i < n; i++ ){
           secondP = secondP.next;
        }

        while (secondP.next != null) {
            firstP = firstP.next;
             secondP= secondP.next;

        }

        firstP.next = firstP.next.next;
        return dummy.next;
    } 
    
}
