package linkedList;

public class GFGMergeTwoSortedLInkedList {
    public static void main(String[] args) {
        
    }
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortedMerge(ListNode head1, ListNode head2){
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
         ListNode head = null;
         ListNode tail =  null;
         ListNode temp1 = head1;
         ListNode temp2 = head2;


        if(temp1.val <= temp2.val){
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }else{
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        while (temp1!=null && temp2!= null) {
            if (temp1.val<= temp2.val) {
                tail.next =temp1;
                tail = temp1;
                temp1 = temp1.next;
            }else{
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null) {
            tail.next = temp2;
        }
        if (temp2 == null) {
            tail.next = temp1;
        }
        return head;
    }
}
