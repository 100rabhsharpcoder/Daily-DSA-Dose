package linkedList;


public class LeetCode328 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    public static void main(String[] args) {
        
    }

    public ListNode oddEvenList(ListNode head){
        ListNode odd = head;
        ListNode even =  head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}}
