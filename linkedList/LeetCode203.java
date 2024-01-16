package linkedList;


public class LeetCode203 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        
        
    }

    public static ListNode removeElememts(ListNode head, int val){
        ListNode temp = new ListNode(-1);

        temp.next = head;
        ListNode curr = temp;
        while (curr!=null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            }else{
                curr =curr.next;
            }
        }
        return temp.next;
    }
}
