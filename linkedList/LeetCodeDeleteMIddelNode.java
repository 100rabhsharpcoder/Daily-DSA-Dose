package linkedList;

import java.util.List;

public class LeetCodeDeleteMIddelNode {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }
    public ListNode deleteMiddle(ListNode head){
        if (head== null || head.next == null) {
            return null;
        }
        ListNode dummy  = new ListNode(0);
        ListNode fast = dummy;
        ListNode slow  = dummy;
        while (fast!=null && fast.next!=null&& fast.next.next!=null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    
}
