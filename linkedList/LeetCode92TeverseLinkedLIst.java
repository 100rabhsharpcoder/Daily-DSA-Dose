package linkedList;

import org.w3c.dom.stylesheets.LinkStyle;

public class LeetCode92TeverseLinkedLIst {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode reverseBetween(ListNode head, int left , int right ){
        ListNode dummy = new ListNode(0);
        ListNode leftPtr = dummy;
        ListNode currNode = head;

        for(int i=0; i< left-1; i++){
            leftPtr = leftPtr.next;
            currNode = currNode.next;
        }

        ListNode subListHead = currNode;
        ListNode preNode = null;

        for(int i=0; i< right -left ; i++){
            ListNode nextNode =  currNode.next;
           currNode.next = preNode;
           preNode = currNode;
           currNode = nextNode;
        }

        leftPtr.next = preNode;
        subListHead.next =currNode;
        return dummy.next;
    }
}
