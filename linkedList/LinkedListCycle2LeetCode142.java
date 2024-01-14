package linkedList;

public class LinkedListCycle2LeetCode142 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
 public static void main(String[] args) {
    
 }  
 public  ListNode detectCycle(ListNode head){
    // start both form head
    ListNode slow =  head; 
    ListNode fast =  head; 

    // advance both at different speeds
    // until the meet
    while (fast!=null && fast.next !=null) {
        fast =fast.next.next;
        slow = slow.next;

        if (slow == fast) {
            while (head!=slow) {
                head = head.next;
                slow =slow.next;
            }
            return slow;
        }
    }

    return null;
 } 
}
