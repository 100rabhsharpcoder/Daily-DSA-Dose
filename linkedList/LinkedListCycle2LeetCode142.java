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



 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast =  head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            // if(fast == null){
            
            //     break;
            // }
        }
    return slow;
    }
}
}
