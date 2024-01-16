package linkedList;

import java.util.List;

public class LeetCode2 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry  =  0;

        while (l1.next != null || l2.next != null) {
             int sum  = 0 + carry;

             if (l1 != null) {
                sum+=l1.val;
                l1=l1.next;
             }

             if (l2!= null) {
                sum+=l2.val;
                l2 = l2.next;
             }

             carry = sum/10;
             sum =  sum%10;
             ptr.next = new ListNode(sum);
             ptr= ptr.next;
        }

        if (carry>0) {
            ptr.next = new ListNode(carry);
        }
        return result.next;
    }
}
