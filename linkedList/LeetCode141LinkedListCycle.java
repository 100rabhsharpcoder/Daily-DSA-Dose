package linkedList;

/**
 * LeetCode141LinkedListCycle
 */
public class LeetCode141LinkedListCycle {

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode DetectCycle(ListNode head){
        ListNode slow = head, fast = head;
        while (slow!=null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}