package linkedList;

import java.util.List;

public class FindlengthofLoop {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        
    }

    public static int finfLengthOfLoop(ListNode head){
        ListNode slow = head;
        ListNode fast =  head;
        int count = 0;

        while(fast!=null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                count = loopNodeCount(slow);
                break;
            }
        }
        return count;

    }

    private static int loopNodeCount(ListNode head){
        ListNode ptr =  head;
        int count = 0;
         while (ptr!=null) {
            ptr = ptr.next;
            count++;
            if (ptr == head) {
                break;
            }
         }
         return count;
    }
    
}
