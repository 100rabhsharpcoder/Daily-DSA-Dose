package linkedList;

public class LeetCode234 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }
    public boolean isPallindrome(ListNode head){
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast!=null) {
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast =  head;
        while (slow!=null) {
            if (slow.val != fast.val) {
                return false;
            }
                slow =slow.next;
                fast = fast.next;
            
        }

        return true;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev =  null;
        while (head!=null) {
            ListNode nextNode =  head.next;
            head.next = prev;
            prev = head;
            head =  nextNode;
        }
        return head;
    }
}
